package com.Proyecto_Aula.domain.service;

import com.Proyecto_Aula.domain.dto.UserDto;
import com.Proyecto_Aula.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDto save (UserDto userDto){
        userRepository.save (UserMapper.toEntity(userDto));
        return userDto;
    }



}
