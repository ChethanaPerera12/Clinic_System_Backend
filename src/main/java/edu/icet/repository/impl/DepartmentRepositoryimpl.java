package edu.icet.repository.impl;

import edu.icet.model.Department;
import edu.icet.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DepartmentRepositoryimpl implements DepartmentRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Department> getAllDepartment() {
        String sql ="SELECT * FROM department";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Department(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                )
        );
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
