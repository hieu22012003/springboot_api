package com.example.book.DTO;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO implements Serializable {
    private Long id;
    private String name;
}
