package com.example.demo.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class TestUser implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String token;

    private static final long serialVersionUID = 1L;
}