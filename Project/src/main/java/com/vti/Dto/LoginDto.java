package com.vti.Dto;

import lombok.Data;

@Data
public class LoginDto {

    private Integer id;

    private String username;
    private String email;

//    private  String password ;

    private String token;
}
