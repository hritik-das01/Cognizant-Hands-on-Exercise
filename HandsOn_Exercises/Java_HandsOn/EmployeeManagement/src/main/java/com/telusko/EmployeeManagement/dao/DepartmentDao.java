package com.telusko.EmployeeManagement.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.telusko.EmployeeManagement.model.Department;

@Repository
public class DepartmentDao {

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }

    private static List<Department> DEPARTMENT_LIST;
}