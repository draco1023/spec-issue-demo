package org.ddr.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Draco
 * @since 2018/7/5
 */
public class People {
    @ApiModelProperty("Name")
    private String name;

    @ApiModelProperty("Age")
    private int age;

    @ApiModelProperty("City")
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public People() {
    }

    public People(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
