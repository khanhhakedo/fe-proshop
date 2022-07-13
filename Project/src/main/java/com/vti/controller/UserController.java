package com.vti.controller;

import com.vti.Dto.LoginDto;
import com.vti.Dto.UserDto;
import com.vti.entity.User;
import com.vti.form.GetUserFormToken;
import com.vti.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;


//    @GetMapping("/login")
//    public LoginDto login(Principal principal) {
//
//        String username = principal.getName();
//        User entity = userService.getUserByUsername(username);
//
//        // convert entity --> dto
//        LoginDto dto = modelMapper.map(entity, LoginDto.class);
//
//        return dto;
//    }

    @PostMapping ("/login")
    public LoginDto login(Principal principal) {

        String email = principal.getName();
        User entity = userService.getUserByEmail(email);

        // convert entity --> dto
        LoginDto dto = modelMapper.map(entity, LoginDto.class);

        return dto;
    }



//    @PostMapping("login")
//    public ResponseEntity<?> getUserByEmailAndPassword(@RequestBody GetUserFormToken form) {
//
//        User user = userService.getUserByEmailAndPassword(form.getEmail(), form.getPassword());
//
//        UserDto userDto = new UserDto();
//        userDto.setUsername(user.getUsername());
//        userDto.setEmail(user.getEmail());
//
//        userDto.setId(user.getId());
//        return new ResponseEntity<>(userDto, HttpStatus.OK);
//
//    }


}
