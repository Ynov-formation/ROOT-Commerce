package com.ynov.commerce.dto.auth;

import com.ynov.commerce.entities.auth.Role;
import com.ynov.commerce.entities.auth.User;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto implements Serializable {
    Long id;
    String firstName;
    String lastName;
    String email;
    String password;
    Role role;

    public UserDto(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.role = user.getRole();
    }
}