package com.springsec.SpringSec.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // Explicit table name to avoid conflicts
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true) // Ensuring unique usernames
    private String username;

    @Column(nullable = false)
    private String password;
}
