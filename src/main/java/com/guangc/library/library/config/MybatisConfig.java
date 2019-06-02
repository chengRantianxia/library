package com.guangc.library.library.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.guangc.library.library.mapper")
public class MybatisConfig {

}
