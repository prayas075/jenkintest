//package com.dc.module;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//
//@TestMethodOrder(OrderAnnotation.class)
//@SpringBootTest(classes={EmployeeRestControllerTest.class})
//public class EmployeeRestControllerTest {
//	
//	@Mock
//	private EmployeeService employeeService;
//	@InjectMocks
//	private EmployeeRestController employeeRestController; 
//	
//	@Test
//	@Order(1)
////	public void getEmployees() {
////		List<EmployeeDto> list=new ArrayList<>();
////		list.add(new EmployeeDto(1, "Prayas", 9000));
////		list.add(new EmployeeDto(2, "Pooja", 19000));
////		when(employeeService.getEmployees()).thenReturn(list);
////		assertEquals(employeeRestController.getEmployees().getStatusCode(),HttpStatus.FOUND );
////	}
//
//}
