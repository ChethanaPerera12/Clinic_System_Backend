package edu.icet.repository.impl;

import edu.icet.model.Department;
import edu.icet.repository.DepartmentRepository;

import java.util.List;

public class DepartmentRepositoryimpl implements DepartmentRepository {
    @Override
    public List<Department> getAllDepartment() {
        return List.of();
    }

    @Override
    public boolean addDepartment(Department department) {
        return false;
    }

    @Override
    public boolean updateDepartment(Department department) {
        return false;
    }

    @Override
    public boolean deleteDepartment(Integer id) {
        return false;
    }

    @Override
    public Department searchDepartment(String id) {
        return null;
    }
}
