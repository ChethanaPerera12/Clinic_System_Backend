package edu.icet.controller;

import edu.icet.dto.DoctorDto;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
@RequiredArgsConstructor
@CrossOrigin
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping("/getAll")
    public List<DoctorDto> getAllDoctors(){
        return doctorService.getAllDoctors();
    }
    @PostMapping("/add")
    public boolean addDoctor(@RequestBody DoctorDto doctorDto) {
        return doctorService.addDoctor(doctorDto);
    }
    @PutMapping("/update")
    public boolean updateDoctor(@RequestBody DoctorDto doctorDto) {
        return doctorService.updateDoctor(doctorDto);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteDoctor(@PathVariable Integer id) {
        return doctorService.deleteDoctor(id);
    }
    @GetMapping("/search/{id}")
    public DoctorDto searchDoctor(@PathVariable Integer id) {
        return doctorService.searchDoctor(id);
    }
}
