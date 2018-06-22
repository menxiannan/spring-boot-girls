package com.example.demo.service.impl;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author 12084
 * @create 2018-06-22 15:09
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users usersAdd(Users users) {
        users.setDelete(false);
        users.setCreateTime(new Date());
        Users u = usersRepository.save(users);
        return u;
    }
}
