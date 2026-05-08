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
        String sql = "INSERT INTO department VALUES (?, ?, ?)";
         return jdbcTemplate.update(sql,
                 department.getId(),
                 department.getName(),
                 department.getDescription()
         ) > 0;
    }

    @Override
    public boolean updateDepartment(Department department) {
        String sql ="UPDATE department SET name=?, description=? WHERE id=?";
        return jdbcTemplate.update(sql,
                department.getName(),
                department.getDescription(),
                department.getId()
        ) > 0;
    }

    @Override
    public boolean deleteDepartment(Integer id) {
        String sql ="DELETE FROM department WHERE id = ?";
        return jdbcTemplate.update(sql, id) > 0;
    }

    @Override
    public Department searchDepartment(String id) {
        String sql ="SELECT * FROM department WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Department(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3)
        ), id);
    }

}
