package com.dc.module;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
		try {
			employeeService.saveEmployee(employeeDto);
			return new ResponseEntity<>("Employee created", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Exception is " + e.getMessage(), HttpStatus.CONFLICT);
		}

	}

	@GetMapping("getAllEmployee")
	public ResponseEntity<List<EmployeeDto>> getEmployees() throws EmployeeNotFoundException {

	   return ResponseEntity.ok(employeeService.getEmployees());

	}

	@GetMapping("sortedAllEmployee")
	public ResponseEntity<List<EmployeeEntity>> getSortedEmployees() {

		return new ResponseEntity<>(employeeService.sortedEmployee(), HttpStatus.FOUND);

	}

	@GetMapping("deleteById/{eid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("eid") Integer eid) {
		try {
			employeeService.deleteEmployee(eid);
			return new ResponseEntity<>("Deleted employee", HttpStatus.FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("findById/{eid}")
	public ResponseEntity<EmployeeDto> findEmployeeById(@PathVariable("eid") Integer eid) {

		
		try {
			return new ResponseEntity<>(employeeService.findEmployeeById(eid), HttpStatus.FOUND);
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	@GetMapping("test/{eid}")
	public ResponseEntity<String> findTest(@PathVariable("eid") Integer eid) throws IdNotFoundException {
//		EmployeeDto findEmployeeById = employeeService.findEmployeeById(eid);
//		System.out.println(findEmployeeById.getEname());
		if(eid!=1)
		throw new IdNotFoundException("Id not found");
		return new ResponseEntity<>("Hello", HttpStatus.FOUND);
	}

}
