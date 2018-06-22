package com.example.demo.repository;

import com.example.demo.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 12084
 * @create 2018-05-16 7:47
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    public List<Girl> findByAge(Integer age);

}
