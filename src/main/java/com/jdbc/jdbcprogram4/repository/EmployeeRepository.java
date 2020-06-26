package com.jdbc.jdbcprogram4.repository;

import com.jdbc.jdbcprogram4.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {

    String saveEmployee(Employee employee);

    List<Employee> getList();

    Employee getEmp(Integer id);

    List<Map<String,Object>> getEmpDeptList();
}
