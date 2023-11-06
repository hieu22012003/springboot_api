package com.example.book.DTO

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.io.Serializable


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class UserDTO : Serializable {
    private val name: String? = null;
    private val roles: List<RoleDTO>? = null;
}