package com.example.app.SpringBootWebContacts.service;

import com.example.app.SpringBootWebContacts.entity.Employee;
import com.example.app.SpringBootWebContacts.repository.EmployeeRepository;
import com.example.app.SpringBootWebContacts.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> getContacts() {
        Iterable<Employee> iterable = repository.findAll();
        List<Employee> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(employee -> new Employee(employee.getId(),
                                Constants.URL_IMAGES + employee.getFirstname(),
                                employee.getSurname(),
                                employee.getPhone()))
                        .toList();
        return new ArrayList<>(list);
    }
}
