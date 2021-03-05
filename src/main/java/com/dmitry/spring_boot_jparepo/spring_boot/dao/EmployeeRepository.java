package com.dmitry.spring_boot_jparepo.spring_boot.dao;

import com.dmitry.spring_boot_jparepo.spring_boot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
