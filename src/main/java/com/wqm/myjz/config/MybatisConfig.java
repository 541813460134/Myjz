package com.wqm.myjz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.wqm.myjz.dao")
public class MybatisConfig {
}
