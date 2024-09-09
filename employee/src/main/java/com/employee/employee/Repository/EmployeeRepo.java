package com.employee.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
