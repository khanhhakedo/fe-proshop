package com.vti.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Data
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    @Column(nullable = false, unique = true, updatable = false)
    private String email;
    @Column(nullable = false, length = 10)
    private String password;
    private String token;
//    private String role = "Employee";

//    @Enumerated(EnumType.ORDINAL)
//    @Column(name = "`status`", nullable = false)
//    private Status status = Status.ACTIVE ;


}
