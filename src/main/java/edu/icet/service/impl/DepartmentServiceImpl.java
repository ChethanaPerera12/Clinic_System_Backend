package edu.icet.service.impl;

import edu.icet.model.Department;
import edu.icet.repository.DepartmentRepository;
import edu.icet.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.getAllDepartment();
    }

    @Override
    public boolean addDepartment(Department department) {
        return departmentRepository.addDepartment(department);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return departmentRepository.updateDepartment(department);
    }

    @Override
    public boolean deleteDepartment(Integer id) {
        return departmentRepository.deleteDepartment(id);
    }

    @Override
    public Department searchDepartment(String id) {
        return departmentRepository.searchDepartment(id);
    }
}
