package com.bazaar.app;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user")
    public List<Users> list() {
        System.out.println(service.getAllUsers());

        return service.getAllUsers();

    }

    @GetMapping("/user/{user_id}")
    public ResponseEntity<Users> get(@PathVariable Integer user_id) {
        try {
            Users users = service.get(user_id);
            return new ResponseEntity<Users>(users, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }

    }
//    @PostMapping("/user")
//    public void add(@RequestBody Users user) {
//        service.save(user);
//    }
}
