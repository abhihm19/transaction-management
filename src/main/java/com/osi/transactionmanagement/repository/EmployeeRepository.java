package com.osi.transactionmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osi.transactionmanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
