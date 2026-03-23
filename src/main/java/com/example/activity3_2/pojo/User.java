package com.example.activity3_2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * User entity class.
 * Contains three fields: id, username, and password.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    /**
     * User id, used as the unique identifier.
     */
    private Long id;

    /**
     * Username for login and display.
     */
    private String username;

    /**
     * Password for authentication.
     */
    private String password;
}
