package com.java.xdd.drools.bean;

/**
 * @author xdd
 * @date 2019/10/30
 */
public class Person {
    private Integer age;
    private String name;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
