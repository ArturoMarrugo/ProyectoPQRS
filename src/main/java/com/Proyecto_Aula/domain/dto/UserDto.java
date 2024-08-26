package com.Proyecto_Aula.domain.dto;

import com.Proyecto_Aula.persistence.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String nombre;
    private String apellido;

    private Role role;
}
