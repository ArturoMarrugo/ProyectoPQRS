package com.Proyecto_Aula.domain.mapper;

public class UserMapper {
    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setUser(userDTO.getUser());
        return user;
    }
}
