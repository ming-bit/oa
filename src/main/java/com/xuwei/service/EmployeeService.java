package com.xuwei.service;


import com.xuwei.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);
    void edit(Employee employee);
    void remove(String sn);
    Employee get(String sn);
    List<Employee> getAll();
}
