package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patients {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String phone;
    private String address;
}

