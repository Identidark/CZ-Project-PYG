package com.pinyougou.pojo;

import java.io.Serializable;

/**
 * @program: pyg_parent
 * @description: 品牌实体类
 * @author: CN_ssh
 * @create: 2019-01-01 14:47
 **/

public class TbBrand implements Serializable {
    private long id;

    private String name;

    private String firstChar;

    @Override
    public String toString() {
        return "TbBrand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstChar='" + firstChar + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}
