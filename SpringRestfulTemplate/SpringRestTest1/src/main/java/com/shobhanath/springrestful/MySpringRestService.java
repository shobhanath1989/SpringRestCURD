package com.shobhanath.springrestful;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shobhanath.springrestful.model.EmployeeListVO;
import com.shobhanath.springrestful.model.EmployeeVO;
/**
 * RestController to perform CRUD Operation
 *  * 
 * @author shobhanath
 *
 */
@RestController
public class MySpringRestService {
	@RequestMapping(value = "/employees")
	public @ResponseBody EmployeeListVO getAllEmployees() {
		EmployeeListVO employees = new EmployeeListVO();

		EmployeeVO empOne = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
		EmployeeVO empTwo = new EmployeeVO(2, "Amit", "Singhal", "asinghal@yahoo.com");
		EmployeeVO empThree = new EmployeeVO(3, "Kirti", "Mishra", "kmishra@gmail.com");

		employees.getEmployees().add(empOne);
		employees.getEmployees().add(empTwo);
		employees.getEmployees().add(empThree);

		return employees;
	}

	@RequestMapping(value = "/employees/{id}")
	@ResponseBody
	public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable("id") int id) {
		if (id <= 3) {
			EmployeeVO employee = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
			return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/springcontent",method = RequestMethod.GET, produces = { "application/xml", "application/json" })
	@ResponseStatus(HttpStatus.OK)
	public EmployeeVO getUser() {
		EmployeeVO employee = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
		return employee;
	}

	@RequestMapping(value = "/springcontent.htm", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String getUserHtml() {
		// Test HTML view
		return "example";
	}

}
