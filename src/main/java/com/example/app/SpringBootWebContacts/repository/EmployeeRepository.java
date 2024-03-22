package com.example.app.SpringBootWebContacts.repository;

import com.example.app.SpringBootWebContacts.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
