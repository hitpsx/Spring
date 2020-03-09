package com.itheima.domain;

import java.io.Serializable;

/**
 * 实体类
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
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


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
