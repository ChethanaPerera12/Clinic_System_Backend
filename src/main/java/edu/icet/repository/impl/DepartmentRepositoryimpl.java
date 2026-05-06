package edu.icet.repository.impl;

import edu.icet.model.Departments;
import edu.icet.repository.DepartmentRepository;

import java.util.List;

public class DepartmentRepositoryimpl implements DepartmentRepository {
    @Override
    public List<Departments> getAllDepartment() {
        return List.of();
    }

    @Override
    public boolean addDepartment(Departments department) {
        return false;
    }

    @Override
    public boolean updateDepartment(Departments department) {
        return false;
    }

    @Override
    public boolean deleteDepartment(Integer id) {
        return false;
    }

    @Override
    public Departments searchDepartment(String id) {
        return null;
    }
}
