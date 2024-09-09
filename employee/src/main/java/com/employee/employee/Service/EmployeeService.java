package com.employee.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.Model.Employee;
import com.employee.employee.Repository.EmployeeRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee getEmployee(long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {

        if (employeeRepo.findAll().isEmpty()) {
            employeeRepo.save(new Employee(0, "Dipak", "Ugale", "Corrigo"));
        }

        return employeeRepo.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
    public void deleteEmployee(long id) {
        employeeRepo.deleteById(id);
    }

}