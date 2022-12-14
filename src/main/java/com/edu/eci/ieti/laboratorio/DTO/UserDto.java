package com.edu.eci.ieti.laboratorio.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDto {
    private String name;
    private String email;
    private String lastname;
    private String password;
}
