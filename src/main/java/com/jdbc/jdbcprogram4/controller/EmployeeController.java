package com.jdbc.jdbcprogram4.controller;

import com.jdbc.jdbcprogram4.dao.EmployeeDao;
import com.jdbc.jdbcprogram4.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
        return employeeDao.saveEmployee(employee);
    }

    @GetMapping(value="/getemplist")
    public List<Employee> getEmplist(){
        return employeeDao.getList();
    }

    @GetMapping(value="/getemp/{id}")
    public Employee getEmp(@PathVariable Integer id){
        return employeeDao.getEmp(id);
    }
}
