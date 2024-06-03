//package com.dc.module;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
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
//
//@SpringBootTest(classes = { EmployeeServiceTest.class })
//@TestMethodOrder(OrderAnnotation.class)
//public class EmployeeServiceTest {
//
////	MockMvc -> Calling controller methods without starting springboot server
////	Mockito is for mocking external dependenices
////  RestTemplate - > Integration testing
////  H2 for database
//	
//	@Mock
//	EmployeeRepo employeeRepo;
//
//	@InjectMocks
//	EmployeeService employeeServicel;
//
//	public List<EmployeeEntity> employeeEntities;
//
//	@Test
//	@Order(5)
//	public void test__getEmployees() throws EmployeeNotFoundException {
//		List<EmployeeEntity> employeeEntities = new ArrayList<>();
//		employeeEntities.add(new EmployeeEntity(1, "Prayas", 9000));
//		employeeEntities.add(new EmployeeEntity(2, "Pooja", 19000));
//		when(employeeRepo.findAll()).thenReturn(employeeEntities);
//		assertEquals(2, employeeServicel.getEmployees().size());
//	}
//
//	@Test
//	@Order(2)
//	public void findEmployeeById_test() throws IdNotFoundException {
//		Integer eid = 1;
//		EmployeeEntity employeeEntity = new EmployeeEntity(1, "Prayas", 9000);
//		when(employeeRepo.findById(eid)).thenReturn(java.util.Optional.of(employeeEntity));
////		 when(employeeRepo.findById(employeeId)).thenReturn(java.util.Optional.of(mockEmployeeEntity));
//
//		assertEquals(employeeEntity.getEid(), employeeServicel.findEmployeeById(eid).getEid());
//	}
//	
//	@Test
//	@Order(3)
//	public void test_saveEmployee() {
//		EmployeeDto employeeDto = new EmployeeDto(1, "Prayas", 9000);
//		EmployeeEntity employeeEntity = new EmployeeEntity(1, "Prayas", 9000);
////		when(employeeRepo.save(any(EmployeeEntity.class))).thenReturn(employeeEntity);
//		when(employeeRepo.save(any(EmployeeEntity.class))).thenReturn(employeeEntity);
//		assertEquals(employeeEntity.getEname(),employeeServicel.saveEmployee(employeeDto).getEname());
//	}
//	
//	@Test
//	@Order(1)
//	public void test_deleteEmployee() {
//		Integer eid = 1;
//        employeeServicel.deleteEmployee(eid);
//        verify(employeeRepo,times(1)).deleteById(eid);
//	}
//
//}
