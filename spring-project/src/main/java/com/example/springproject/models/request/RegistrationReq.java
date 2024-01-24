package com.example.springproject.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationReq {
    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
