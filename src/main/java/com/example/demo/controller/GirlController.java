package com.example.demo.controller;

import com.example.demo.entity.Girl;
import com.example.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 12084
 * @create 2018-05-16 7:48
 */

@RestController
public class GirlController {

    @Autowired
    private GirlService girlService;


    /**
     * 获取list
     *
     * @return
     */
    @GetMapping(value = "/girlList")
    public List<Girl> girlList() {
        return girlService.getGirlList();
    }

    /**
     * 添加
     *
     * @param name
     * @param cutSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girlList")
    public Girl girlAdd(@RequestParam("name") String name, @RequestParam("cutSize") String cutSize,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setName(name);
        girl.setCutSize(cutSize);
        girl.setAge(age);
        return girlService.girlSave(girl);
    }

    /**
     * 详情
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/girl/{id}")
    public Girl getOne(@PathVariable("id") Integer id) {
        Girl girl = girlService.findOne(id);
        return girl;
    }


    /**
     * 修改
     *
     * @param id
     * @param name
     * @param cutSize
     * @param age
     */
    @PutMapping(value = "/girl/{id}")
    public Girl updateGirl(@PathVariable("id") Integer id, @RequestParam(value = "name", required = false) String name,
                           @RequestParam("cutSize") String cutSize,
                           @RequestParam("age") Integer age) {
        Girl girl = girlService.updateOne(id, name, cutSize, age);
        return girl;
    }

    /**
     * 删除
     *
     * @param id
     */
    @DeleteMapping(value = "/girl/{id}")
    public void deleteById(@PathVariable("id") Integer id) {

        girlService.deleteById(id);
    }

    /**
     * 通过年龄查询
     * @param age
     * @return
     */
    @GetMapping(value = "/girl/age/{age}")
    public List<Girl> findByAge(@PathVariable("age") Integer age) {
        List<Girl> girlList = girlService.findByAge(age);
        return girlList;
    }


    @PostMapping(value = "/girl/two")
    public void saveTwo() {
        girlService.saveTwo();

    }
}

