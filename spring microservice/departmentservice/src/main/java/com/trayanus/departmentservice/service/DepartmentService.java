package com.trayanus.departmentservice.service;

import com.trayanus.departmentservice.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}