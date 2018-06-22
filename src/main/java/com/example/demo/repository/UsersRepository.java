package com.example.demo.repository;

import com.example.demo.entity.Users;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 12084
 * @create 2018-06-22 15:07
 */

public interface UsersRepository extends JpaRepository<Users, Integer> {

    @Override
    <S extends Users> List<S> findAll(Example<S> example);
}
