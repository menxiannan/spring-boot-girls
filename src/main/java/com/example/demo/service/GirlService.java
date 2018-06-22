package com.example.demo.service;

import com.example.demo.entity.Girl;

import java.util.List;

/**
 * @author 12084
 * @create 2018-05-16 7:46
 */

public interface GirlService {

    /**
     * 获取所有
     * @return
     */
    List<Girl> getGirlList();

    /**
     * 添加一个
     * @param girl
     * @return
     */
    Girl girlSave(Girl girl);

    /**
     * 删除一个
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 详情
     * @param id
     * @return
     */
    Girl findOne(Integer id);

    /**
     * 修改
     * @param id
     * @param name
     * @param cutSize
     * @param age
     * @return
     */
    Girl updateOne(Integer id,String name,String cutSize,Integer age);

    /**
     * 通过年龄查询
     * @param age
     * @return
     */
    List<Girl> findByAge(Integer age);

    void saveTwo();


}
