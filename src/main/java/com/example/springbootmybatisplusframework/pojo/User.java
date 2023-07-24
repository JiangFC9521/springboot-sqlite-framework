package com.example.springbootmybatisplusframework.pojo;

import lombok.Data;

/**
 * Description: 用户表
 * Author: jiangmengnan
 * CreateDate: 2023/7/21
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
