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
public class RoleDTO implements Serializable {
    private val id: Long? = null;
    private val name: String? = null;
}
