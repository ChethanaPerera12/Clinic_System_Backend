package edu.icet.controller;

import edu.icet.model.Departments;
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
    public List<Departments> getAllDepartment(){
        return departmentService.getAllDepartment();
    }
    @PostMapping("/add")
    public boolean addDepartment(@RequestBody Departments department){
        return departmentService.addDepartment(department);
    }
    @PutMapping("/update")
    public boolean updateDepartment(@RequestBody Departments department){
        return departmentService.updateDepartment(department);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteDepartment(@PathVariable Integer id){
        return departmentService.deleteDepartment(id);
    }
    @GetMapping("/search/{id}")
    public Departments searchDepartment(@PathVariable String id){
        return departmentService.searchDepartment(id);
    }
}
