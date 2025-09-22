package com.example.Job.Resume.Matcher.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "job_description")
public class JobDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "uuid", updatable = false, nullable = false, length = 36)
    private String uuid= UUID.randomUUID().toString();

    @Lob
    @Column(name = "job_descrip", nullable = false)
    private String job_description;

    @Column(name = "is_flag")
    private Boolean isFlag=true;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
