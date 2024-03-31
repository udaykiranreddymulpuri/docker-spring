package com.practice.springdemo.controller;

import com.practice.springdemo.entity.Department;
import com.practice.springdemo.service.DepartmentService;
import com.practice.springdemo.service.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDept")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartments(department);

    }

    @GetMapping("/getDept")
    public List<Department> getDepartments(){
        return departmentService.getDepartments();
    }

    @GetMapping("/getDeptId/{id}")
    public Department getDepartmentByID(@PathVariable("id") Long deptid){
        return departmentService.getDepartmentByID(deptid);
    }

    @DeleteMapping("/{id}")
    public String deleteDept(@PathVariable("id") Long deptid){
        return departmentService.deleteDepartmentByID(deptid);
    }

    @PutMapping("/{id}")
    public Department updateDept(@PathVariable("id") long deptid, @RequestBody Department department){
        return departmentService.updateDepartment(deptid,department);

    }

}
