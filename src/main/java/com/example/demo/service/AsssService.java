package com.example.demo.service;

import com.example.demo.entity.Girl;
import com.example.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author 12084
 * @create 2018-05-16 19:44
 */
@Service
public class AsssService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void saveTwo() {
        Girl girlA = new Girl();
        girlA.setName("小娇娇");
        girlA.setAge(18);
        girlA.setCutSize("C");
        girlA.setCreateTime(new Date());
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setName("小娇娇2");
        girlB.setAge(18);
        girlB.setCutSize("Ccc");
        girlB.setCreateTime(new Date());
        girlRepository.save(girlB);
    }
}
