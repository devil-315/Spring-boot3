package com.devil.crud.service;

import com.devil.crud.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName：EmployeeService
 *
 * @author: Devil
 * @Date: 2024/12/18
 * @Description:
 * @version: 1.0
 */
@Service
public class EmployeeService {

    Map<Long, Employee> data = new ConcurrentHashMap<>();

    public Employee getEmployeeById(Long id) {
        return data.get(id);
    }

    public List<Employee> getEmployees() {
        return data.values().stream().toList();
    }

    public void saveEmployee(Employee employee) {
        data.put(employee.getId(),employee);
    }

    public void deleteEmployee(Long id) {
        data.remove(id);
    }
}
