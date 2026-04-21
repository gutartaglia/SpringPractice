package com.example.SpringPractice.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringPractice.entities.User;
import com.example.SpringPractice.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @Autowired
    private UserService userService; 

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        
        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);

    } 

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = userService.findById(id);
        return ResponseEntity.ok().body(obj);
    } 
    

}
