package edu.icet.controller;

import edu.icet.dto.DepartmentDto;
import edu.icet.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
@RequiredArgsConstructor
@CrossOrigin
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping("/getAll")
    public List<DepartmentDto> getAllDepartment(){
        return departmentService.getAllDepartment();
    }
    @PostMapping("/add")
    public boolean addDepartment(@RequestBody DepartmentDto departmentDto){
        return departmentService.addDepartment(departmentDto);
    }
    @PutMapping("/update")
    public boolean updateDepartment(@RequestBody DepartmentDto departmentDto){
        return departmentService.updateDepartment(departmentDto);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteDepartment(@PathVariable Integer id){
        return departmentService.deleteDepartment(id);
    }
    @GetMapping("/search/{id}")
    public DepartmentDto searchDepartment(@PathVariable Integer id){
        return departmentService.searchDepartment(id);
    }
}
