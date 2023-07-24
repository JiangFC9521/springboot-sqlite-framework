package com.example.springbootmybatisplusframework.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootmybatisplusframework.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: 用户表
 * Author: jiangmengnan
 * CreateDate: 2023/7/21
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
