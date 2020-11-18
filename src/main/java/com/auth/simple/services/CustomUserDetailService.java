package com.auth.simple.services;

import com.auth.simple.model.CustomUserDetail;
import com.auth.simple.model.User;
import com.auth.simple.repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;


public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> optionalUser=userRepository.findUserByUsername("name");
        optionalUser.orElseThrow(()->new UnsupportedOperationException("mill"));
        return optionalUser.map(CustomUserDetail::new).get();
    }
}
