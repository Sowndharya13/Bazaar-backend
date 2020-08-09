package com.bazaar.app;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user")
    public List<Users> list() {
        System.out.println(service.getAllUsers());

        return service.getAllUsers();

    }
}
