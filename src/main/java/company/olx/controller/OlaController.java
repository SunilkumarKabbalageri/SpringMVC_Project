package company.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import company.olx.dao.OlaDao;
import company.olx.dto.OlaDto;

@Controller
public class OlaController {

	@Autowired
	OlaDao dao;

	@RequestMapping("/home")
	public String Home() {
		return "home";
	}

	@RequestMapping("/insert")
	public String insertData() {
		return "insert";
	}

	@RequestMapping("/insertdata")
	@ResponseBody
	public String insert(@ModelAttribute OlaDto dto) {
		dao.insertdata(dto);
		return "<h1>data added Sucessfully</h1>";
		// System.out.println(dto.getCustomer_no()+"--"+dto.getEmail()+"--"+dto.getName()+"--"+dto.getVehicle());
	}

	// to fetchAll the data from database
	@RequestMapping("/fetch")
	public ModelAndView getData() {
		ModelAndView andView = new ModelAndView();
		List<OlaDto> list = dao.getData();
		andView.addObject("list", list);
		andView.setViewName("fetch");
		return andView;
	}

	// delete single data
	@RequestMapping("/delete")
	public String deleteData() {
		return "Delete";
	}

	// @RequestMapping("/deletedata/{customer_id}")
	@RequestMapping("/deletedata")
	@ResponseBody
	public String deleteValue(@RequestParam("customer_id") int id) {
		dao.deletedata(id);
		return "<center><h1>deleted  the data</h1></center>";

	}

	// delete all the data from database
	@RequestMapping("/deleteAll")
	@ResponseBody
	public String deleteAll() {
		return dao.DeleteAll();
	}

	// update the data
	@RequestMapping("/update")
	public String UpdateData() {
		return "update";
	}

	@RequestMapping("/updatedata")
	@ResponseBody
	public String Updatedata(@RequestParam("customer_id") int id, @RequestParam("name") String name,
			@RequestParam("vehicle") String vehicle) {
		dao.updateData(id, name, vehicle);
		return "Updated Sucessfully";

	}
}
