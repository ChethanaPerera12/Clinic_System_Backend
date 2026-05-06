package edu.icet.controller;

import edu.icet.model.Patients;
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
    public List<Patients> getAllPatients(){
        return patientService.getAllPatients();
    }
    @PostMapping("/add")
    public boolean addPatient(@RequestBody Patients patients) {
        return patientService.addPatient(patients);
    }
    @PutMapping("/update")
    public boolean updatePatient(@RequestBody Patients patients) {
        return patientService.updatePatient(patients);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deletePatient(@PathVariable Integer id) {
        return patientService.deletePatient(id);
    }
    @GetMapping("search/{id}")
    public Patients searchPatient(@PathVariable String id) {
        return patientService.searchPatient(id);
    }
}
