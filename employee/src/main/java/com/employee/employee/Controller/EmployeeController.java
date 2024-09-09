package com.employee.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.Model.Employee;
import com.employee.employee.Service.EmployeeService;




@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getMethodName(@PathVariable(name="id") String param) {
        System.out.println("param value is = "+param);
        Long x= Long.valueOf(param);
        return employeeService.getEmployee(x);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/")
    public Employee postMethodName(@RequestBody Employee employee) {
        
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee putMethodName(@PathVariable(name="id") Long id, @RequestBody Employee employee) {
        
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "deleted: "+id;
    }
    
    
    

}
