package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 12084
 * @create 2018-06-22 15:05
 */

@RestController
@RequestMapping("/users")
public class UsersController {

    public static final Logger logger = LoggerFactory.getLogger(UsersController.class);


    @Autowired
    private UsersService usersService;


    @PostMapping(value = "/add")
    private Users usersAdd(@RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("age") Integer age) {
        Users u = new Users();
        u.setName(name);
        u.setAge(age);
        u.setPhone(phone);
        return usersService.usersAdd(u);

    }
}
