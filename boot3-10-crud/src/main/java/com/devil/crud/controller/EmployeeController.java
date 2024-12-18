package com.devil.crud.controller;

import com.devil.crud.entity.Employee;
import com.devil.crud.service.EmployeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName：EmployeeController
 *
 * @author: Devil
 * @Date: 2024/12/18
 * @Description:
 * @version: 1.0
 */
@Tag(name = "员工",description = "员工CRUD")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/emps")
    public List<Employee> getEmployee(){
        return employeeService.getEmployees();
    }

    @PostMapping("/emp")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "ok";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return "ok";
    }
}
