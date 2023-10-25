package company.olx.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import company.olx.dto.OlaDto;

@Component
public class OlaDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abcd");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insertdata(OlaDto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();

	}

	public List<OlaDto> getData() {
		Query query = entityManager.createQuery("select a from OlaDto a");
		List<OlaDto> dtos = query.getResultList();
		return dtos;

	}

	public void deletedata(int id) {
		OlaDto dto = entityManager.find(OlaDto.class, id);
		entityTransaction.begin();
		entityManager.remove(dto);
		entityTransaction.commit();

	}

	public String DeleteAll() {
		Query query = entityManager.createQuery("delete from OlaDto");
		// List<OlaDto> x=query.getResultList();
		entityTransaction.begin();
		query.executeUpdate();
		entityTransaction.commit();
		return "<h1> All the Data Deleted Sucessfully</h1>";

	}

	

	public void updateData(int id, String name, String vehicle) {
		OlaDto dto2= entityManager.find(OlaDto.class, id);
		dto2.setName(name);
		dto2.setVehicle(vehicle);

		entityTransaction.begin();
		entityManager.merge(dto2);
		entityTransaction.commit();
		
	}

}
