package com.telusko.EmployeeManagement.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.telusko.EmployeeManagement.model.Employee;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}