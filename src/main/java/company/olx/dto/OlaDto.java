package company.olx.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OlaDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Customer_id;
	private String name;
	private String email;
	private String vehicle;
	private long customer_no;

	public int getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public long getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(long customer_no) {
		this.customer_no = customer_no;
	}

	@Override
	public String toString() {
		return "OlaDto [Customer_id=" + Customer_id + ", name=" + name + ", email=" + email + ", vehicle=" + vehicle
				+ ", customer_no=" + customer_no + "]";
	}

	public OlaDto(int customer_id, String name, String email, String vehicle, long customer_no) {
		super();
		Customer_id = customer_id;
		this.name = name;
		this.email = email;
		this.vehicle = vehicle;
		this.customer_no = customer_no;
	}

	public OlaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
