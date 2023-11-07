package com.example.book.mapper;

import com.example.book.DTO.UserCreationDTO;
import com.example.book.DTO.UserDTO;
import com.example.book.entity.User;

import java.util.stream.Collectors;

public class UserMapper {
    private static UserMapper INSTANCE;

    public static UserMapper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserMapper();
        }

        return INSTANCE;
    }

    public User toEntity(UserCreationDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setPassword(dto.getPassword());
        return user;
    }

    public UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setName(user.getName());
        dto.setRoles(user.getRoles().stream()
                .map(role -> RoleMapper.getInstance().toDTO(role))
                .collect(Collectors.toList()));
        return dto;
    }
}