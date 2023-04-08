package com.project.employee.service;

import com.project.employee.Employee.Employee;
import com.project.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll();
		return emps;
	}

	public Employee getEmployee(int id){
		return employeeRepository.findById(id).get();
	}

	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}

	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}

	public void deleteAllEmployees(){
		employeeRepository.deleteAll();
	}

	public void deleteEmployeeByID(int id){
		employeeRepository.deleteById(id);
	}

	public void patchEmployee(Employee emp, int id) {
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
}
