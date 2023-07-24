package com.example.springbootmybatisplusframework.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: demo controller
 * Author: jiangmengnan
 * CreateDate: 2023/7/21
 */
@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
@Api(tags = "demo controller")
public class DemoController {

    @ApiOperation(value = "test接口")
    @GetMapping("test")
    public String test() {
        return  "demo success";
    }

}
