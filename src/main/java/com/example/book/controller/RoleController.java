package com.example.book.controller;

import com.example.book.DTO.RoleDTO;
import com.example.book.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping
    public RoleDTO create(@RequestBody RoleDTO dto) {
        return roleService.create(dto);
    }
}