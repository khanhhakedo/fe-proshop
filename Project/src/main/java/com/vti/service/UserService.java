package com.vti.service;

import com.vti.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    User getUserByEmailAndPassword(String email, String password);
//    public User getUserByEmail(String email);


    public User getUserByUsername(String username);
    public User getUserByEmail(String email);

}
