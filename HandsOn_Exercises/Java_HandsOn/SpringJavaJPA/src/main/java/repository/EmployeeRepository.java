package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	List<Employee> findByName(String name);

	List<Employee> findByEmailContaining(String email);

	List<Employee> findByDepartmentName(String departmentName);
}
