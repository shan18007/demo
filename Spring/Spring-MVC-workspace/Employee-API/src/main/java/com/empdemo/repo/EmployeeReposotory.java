package com.empdemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.empdemo.entity.Employee;

public interface EmployeeReposotory extends CrudRepository<Employee, Long> {

	
}
