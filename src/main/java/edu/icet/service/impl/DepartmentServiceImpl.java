package edu.icet.service.impl;

import edu.icet.model.Departments;
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
    public List<Departments> getAllDepartment() {
        return departmentRepository.getAllDepartment();
    }

    @Override
    public boolean addDepartment(Departments department) {
        return departmentRepository.addDepartment(department);
    }

    @Override
    public boolean updateDepartment(Departments department) {
        return departmentRepository.updateDepartment(department);
    }

    @Override
    public boolean deleteDepartment(Integer id) {
        return departmentRepository.deleteDepartment(id);
    }

    @Override
    public Departments searchDepartment(String id) {
        return departmentRepository.searchDepartment(id);
    }
}
