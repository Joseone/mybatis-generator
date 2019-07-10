package com.ihomefnt.mybatis.genrator.mybatisgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorApplication.class, args);
    }

    /*
     * 执行方式：
     * 第一步：选择右侧Maven -> Plugins -> mybatis-generator
     *
     * 第二步：右键选择执行mybatis-generator:generate
     *
     * */
}
