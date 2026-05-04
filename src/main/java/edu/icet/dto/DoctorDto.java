package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
    private Long id;
    private String name;
    private String specialization;
    private String email;
    private String phone;
    private String licenseNumber;
}
