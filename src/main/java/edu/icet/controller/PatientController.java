package edu.icet.controller;

import edu.icet.dto.PatientDto;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
@CrossOrigin
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/getAll")
    public List<PatientDto> getAllPatients(){
        return patientService.getAllPatients();
    }
    @PostMapping("/add")
    public boolean addPatient(@RequestBody PatientDto patientDto) {
        return patientService.addPatient(patientDto);
    }
    @PutMapping("/update")
    public boolean updatePatient(@RequestBody PatientDto patientDto) {
        return patientService.updatePatient(patientDto);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deletePatient(@PathVariable Integer id) {
        return patientService.deletePatient(id);
    }
    @GetMapping("search/{id}")
    public PatientDto searchPatient(@PathVariable Integer id) {
        return patientService.searchPatient(id);
    }
}
