package com.example.Job.Resume.Matcher.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "uuid", unique = true,updatable = false, length = 36)
    private String uuid= UUID.randomUUID().toString();

    @Column(name = "is_flag")
    private Boolean isFlag=true;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
