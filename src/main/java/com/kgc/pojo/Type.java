package com.kgc.pojo;

/**
 * @author YaChow
 * @create 2021-03-08-9:26
 */
public class Type {
    private Integer id;
    private String type_name;

    public Type() {
    }

    public Type(Integer id, String type_name) {
        this.id = id;
        this.type_name = type_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }
}
