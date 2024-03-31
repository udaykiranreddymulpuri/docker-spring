package com.practice.springdemo.service;

import com.practice.springdemo.entity.Department;
import com.practice.springdemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartments(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentByID(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public String deleteDepartmentByID(Long deptid) {
        departmentRepository.deleteById(deptid);
        return "Department Deleted";
    }

    @Override
    public Department updateDepartment(Long deptid,Department department) {
        Department fromdb=departmentRepository.findById(deptid).get();

        fromdb.setDepartmentName(department.getDepartmentName());
        fromdb.setDepartmentCode(department.getDepartmentCode());
        fromdb.setDepartmentAddress(department.getDepartmentAddress());
        return departmentRepository.save(fromdb);
    }


}
