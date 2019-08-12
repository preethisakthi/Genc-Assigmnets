package com.javasampleapproach.springrest.mysql.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.springrest.mysql.model.Customer;
import com.javasampleapproach.springrest.mysql.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	List<Employee> findByAge(int age);
    Employee save(Customer customer);
}
