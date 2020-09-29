package com.itheilv.mybatisplus.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itheilv.mybatisplus.base.BaseModel;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户详情
 *
 * @author WSQ
 * @since 2020-09-29
 */

@TableName("user")
@ApiModel(value = "User对象", description = "用户详情")
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 用户姓名
     */
    @TableField("name")
    @ApiModelProperty(value = "用户姓名")
    protected String name;

    /**
     * 用户年龄
     */
    @TableField("age")
    @ApiModelProperty(value = "用户年龄")
    protected Integer age;

    /**
     * 用户性别
     */
    @TableField("sex")
    @ApiModelProperty(value = "用户性别")
    protected String sex;

    /**
     * 家庭住址
     */
    @TableField("address")
    @ApiModelProperty(value = "家庭住址")
    protected String address;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name=" + name +
                ", age=" + age +
                ", sex=" + sex +
                ", address=" + address +
                "}";
    }
}