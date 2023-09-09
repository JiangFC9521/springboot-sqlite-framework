package com.example.springbootmybatisplusframework.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description: 用户表
 * Author: jiangmengnan
 * CreateDate: 2023/7/21
 */
@Data
@TableName("user")
public class UserEntity {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
