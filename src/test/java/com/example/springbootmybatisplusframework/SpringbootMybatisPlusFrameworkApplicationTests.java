package com.example.springbootmybatisplusframework;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.example.springbootmybatisplusframework.mapper.UserMapper;
import com.example.springbootmybatisplusframework.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("dev")
class SpringbootMybatisPlusFrameworkApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<UserEntity> userEntityList = userMapper.selectList(null);
        Assert.isTrue(5 == userEntityList.size(), "");
        userEntityList.forEach(System.out::println);
    }

}
