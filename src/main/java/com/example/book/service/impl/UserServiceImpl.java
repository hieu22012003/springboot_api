package com.example.book.service.impl;

import com.example.book.DTO.UserCreationDTO;
import com.example.book.DTO.UserDTO;
import com.example.book.entity.Role;
import com.example.book.entity.User;
import com.example.book.mapper.UserMapper;
import com.example.book.repository.RoleRepository;
import com.example.book.repository.UserRepository;
import com.example.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Throwable.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDTO create(UserCreationDTO dto) {
        User user = UserMapper.getInstance().toEntity(dto);
        List<Role> roles = roleRepository.findAllById(dto.getRoleIds());
        user.setRoles(roles);
        return UserMapper.getInstance().toDTO(userRepository.save(user));
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(user -> UserMapper.getInstance().toDTO(user))
                .collect(Collectors.toList());
    }
}