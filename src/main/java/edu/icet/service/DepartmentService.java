package edu.icet.service;

import edu.icet.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    List<DepartmentDto> getAllDepartment();
    boolean addDepartment(DepartmentDto departmentDto);
    boolean updateDepartment(DepartmentDto departmentDto);
    boolean deleteDepartment(Integer id);
    DepartmentDto searchDepartment(Integer id);
}
