package com.practice.springdemo.service;

import com.practice.springdemo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartments(Department department);

   public List<Department> getDepartments();

   public  Department getDepartmentByID(Long id);

   public String deleteDepartmentByID(Long deptid);

   public Department updateDepartment(Long deptid,Department department);
}
