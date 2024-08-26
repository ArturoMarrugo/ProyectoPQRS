package com.Proyecto_Aula.domain.service;

import com.Proyecto_Aula.domain.dto.RoleDto;
import com.Proyecto_Aula.domain.mapper.RoleMapper;
import com.Proyecto_Aula.persistence.repository.RepositoryRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public RoleDto save(RoleDto roleDto){
        roleRepository.save(RoleMapper.toEntity(roleDto));
        return roleDto;
    }


}
