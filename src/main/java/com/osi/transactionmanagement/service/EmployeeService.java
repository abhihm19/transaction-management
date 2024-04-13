package com.osi.transactionmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.osi.transactionmanagement.entity.Employee;
import com.osi.transactionmanagement.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	//@Transactional(rollbackFor = {Exception1.class, Exception2.class, Exception3.class})
	@Transactional(rollbackFor = {Exception.class})
	public String addEmployees() throws Exception {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "AAA", "D1"));
		employees.add(new Employee(2, "BBB", "D1"));
		employees.add(new Employee(3, "CCC", "D2"));
		employees.add(new Employee(4, "DDD", "D3"));
		employees.add(new Employee(5, "EEE", "D2"));
		
		int count = 0;
		for(Employee employee: employees) {
			if(count == 3) throw new Exception("Throwing exception for demoing rollback");
			employeeRepository.save(employee);
			count++;
		}
		
		return "employees saved successfully";
	}

}
