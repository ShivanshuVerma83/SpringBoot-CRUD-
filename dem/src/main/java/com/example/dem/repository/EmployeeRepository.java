package com.example.dem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
