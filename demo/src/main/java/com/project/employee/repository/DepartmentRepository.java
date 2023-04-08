package com.project.employee.repository;

import com.project.employee.Employee.Department;
import org.springframework.data.repository.CrudRepository;
public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
