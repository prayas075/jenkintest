//package com.dc.module;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//@AutoConfiguration
//@ContextConfiguration
//@ComponentScan(basePackages = "com.dc.module")
//@SpringBootTest(classes = { EmployeeRestControllerMockMvc.class })
//public class EmployeeRestControllerMockMvc {
//
//	@Autowired
//	MockMvc mockMvc;
//
//	@Mock
//	EmployeeService employeeServicel;
//
//	@InjectMocks
//	EmployeeRestController employeeRestController;
//
//	@BeforeEach
//	public void setUp() {
//		mockMvc = MockMvcBuilders.standaloneSetup(employeeRestController).build();
//	}
//
//	public void test_findEmployeeById() {
//
//	}
//}
