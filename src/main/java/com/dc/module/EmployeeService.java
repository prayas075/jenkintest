package com.dc.module;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
//	private static final Logger logInfo = LoggerFactory.getLogger(EmployeeService.class);
	@Autowired
	private EmployeeRepo employeeRepo;

	public EmployeeEntity saveEmployee(EmployeeDto employeeDto) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDto, employeeEntity);
//		logInfo.info("Employee + " + employeeEntity.getEname());
		return employeeRepo.save(employeeEntity);
	}

	public List<EmployeeDto> getEmployees() throws EmployeeNotFoundException {
		List<EmployeeEntity> employeeEntity = employeeRepo.findAll();
		List<EmployeeDto> employeeDtoList = new ArrayList<>();
		if (!employeeEntity.isEmpty()) {
			
		
			for (EmployeeEntity e : employeeEntity) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(e, employeeDto);
				employeeDtoList.add(employeeDto);

//				logInfo.debug("DEBUG GET METHOD");

			}
			return employeeDtoList;
		}
		else {
			
			System.out.println("It is empty");
			throw new EmployeeNotFoundException("Employee not found");
		}
	}

	public void deleteEmployee(Integer eid) {

		employeeRepo.deleteById(eid);
	}
	
	public List<EmployeeEntity> sortedEmployee() {

		Pageable pg=PageRequest.of(0, 1);
		 List<EmployeeEntity> content = employeeRepo.findAll(pg).getContent();
		 System.out.println(content);
		 return content;
	}

	
	public EmployeeDto findEmployeeById(Integer eid) throws IdNotFoundException {
		Optional<EmployeeEntity> findById = employeeRepo.findById(eid);
		    if(findById.isPresent()) {
			EmployeeDto employeeDto = new EmployeeDto();
			BeanUtils.copyProperties(findById.get(), employeeDto);
			return employeeDto;
		    }else {
		    	throw new IdNotFoundException("Id not found");
		    }

	}

}
