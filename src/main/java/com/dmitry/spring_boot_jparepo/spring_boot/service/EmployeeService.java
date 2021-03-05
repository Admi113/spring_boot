package com.dmitry.spring_boot_jparepo.spring_boot.service;




import com.dmitry.spring_boot_jparepo.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

   public void  deleteEmployee(int id);
}
