package com.example.dem;

import com.example.dem.model.Employee;
import com.example.dem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception{
		Employee employee = new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Kumar");
		employee.setEmailId("ramesh@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Shivanshu");
		employee1.setLastName("Verma");
		employee1.setEmailId("shivanshu@gmail.com");
		employeeRepository.save(employee1);

	}

}


