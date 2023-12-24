package com.inicio.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inicio.curso.model.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Rafael", "rafa@email.com", "9999999", "123456789");
        return ResponseEntity.ok().body(user);
    }
}
