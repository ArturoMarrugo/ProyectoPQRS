package com.Proyecto_Aula.domain.mapper;

import com.Proyecto_Aula.domain.dto.RoleDto;
import com.Proyecto_Aula.persistence.entity.Role;

public class RoleMapper {
    public static Role toEntity(RoleDto roleDto){


        Role role = new Role();
        role.setNombreRol(roleDto.getNombre());
        return role;
    }
    public static RoleDto toDTO(Role role) {
        RoleDto roleDTO = new RoleDto();
        roleDTO.setNombre(roleDTO.getNombre());
        return roleDTO;

    }
}
