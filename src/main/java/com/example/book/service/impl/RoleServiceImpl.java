package com.example.book.service.impl;

import com.example.book.DTO.RoleDTO;
import com.example.book.entity.Role;
import com.example.book.mapper.RoleMapper;
import com.example.book.repository.RoleRepository;
import com.example.book.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Throwable.class)
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleDTO create(RoleDTO dto) {
        Role role = new Role();
        role.setName(dto.getName());
        return RoleMapper.getInstance().toDTO(roleRepository.save(role));
    }
}