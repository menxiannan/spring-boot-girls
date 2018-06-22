package com.example.demo.service.impl;

import com.example.demo.entity.Girl;
import com.example.demo.repository.GirlRepository;
import com.example.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author 12084
 * @create 2018-05-16 7:47
 */
@Service
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlRepository girlRepository;


    @Transactional
    @Override
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

    @Override
    public List<Girl> findByAge(Integer age) {
        return girlRepository.findByAge(age);
    }

    @Override
    public Girl findOne(Integer id) {
        Girl girl = girlRepository.findById(id).get();
        return girl;
    }

    @Override
    public Girl updateOne(Integer id, String name, String cutSize, Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setName(name);
        girl.setCutSize(cutSize);
        girl.setAge(age);
        return girlRepository.saveAndFlush(girl);
    }

    @Override
    public void deleteById(Integer id) {
        girlRepository.deleteById(id);
    }

    @Override
    public List<Girl> getGirlList() {
        return girlRepository.findAll();
    }

    @Override
    public Girl girlSave(Girl girl) {
        if(null != girl){
            girl.setCreateTime(new Date());
        }
        return girlRepository.save(girl);
    }
}
