package com.dmitry.spring_boot_jparepo.spring_boot.service;




import com.dmitry.spring_boot_jparepo.spring_boot.dao.EmployeeRepository;
import com.dmitry.spring_boot_jparepo.spring_boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeDao;

    @Override
    @Transactional


    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        Employee emp = null;
        Optional<Employee> optional = employeeDao.findById(id);
        if(optional.isPresent()){
            emp = optional.get();
        }
        return emp;
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDao.deleteById(id);
    }

}
