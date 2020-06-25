package com.jdbc.jdbcprogram4.dao;

import com.jdbc.jdbcprogram4.model.Employee;
import com.jdbc.jdbcprogram4.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao implements EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String saveEmployee(Employee employee) {
        String sql="insert into employee values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{
                employee.getId(),employee.getName(),employee.getCity()
        });
        return "Employee Saved";
    }

    @Override
    public List<Employee> getList() {
        String sql="select * from employee";
        List<Employee> list=jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Employee.class));
        return list;
    }

    @Override
    public Employee getEmp(Integer id) {
        String sql="select * from employee where id=?";
        Employee e= (Employee) jdbcTemplate.queryForObject(sql,new Object[]{id},
                new BeanPropertyRowMapper(Employee.class));
        return e;
    }
}
