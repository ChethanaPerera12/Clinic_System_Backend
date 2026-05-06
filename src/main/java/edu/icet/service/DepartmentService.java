package edu.icet.service;

import edu.icet.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartment();
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(Integer id);
    Department searchDepartment(String id);
}
