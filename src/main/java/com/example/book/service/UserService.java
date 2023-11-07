package com.example.book.service;

import com.example.book.DTO.UserCreationDTO;
import com.example.book.DTO.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO create(UserCreationDTO dto);

    List<UserDTO> findAll();
}
