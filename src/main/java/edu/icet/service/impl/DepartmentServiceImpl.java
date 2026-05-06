package edu.icet.service.impl;

import edu.icet.dto.DepartmentDto;
import edu.icet.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {
    final DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentDto> getAllDepartment() {
        return List.of();
    }

    @Override
    public boolean addDepartment(DepartmentDto departmentDto) {
        return false;
    }

    @Override
    public boolean updateDepartment(DepartmentDto departmentDto) {
        return false;
    }

    @Override
    public boolean deleteDepartment(Integer id) {
        return false;
    }

    @Override
    public DepartmentDto searchDepartment(Integer id) {
        return null;
    }
}
