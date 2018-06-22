package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 12084
 * @create 2018-06-22 15:02
 */
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
    * 姓名
    */
    @Column(name = "name")
    private String name;

    /**
    * phone
    */
    @Column(name = "phone")
    private String phone;

    /**
    * age
    */
    @Column(name = "age")
    private Integer age;

    @Column(name = "isDelete")
    private boolean isDelete;

    @Column(name = "createTime")
    private Date createTime;




    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
