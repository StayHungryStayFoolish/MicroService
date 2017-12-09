# Micro Service Spring Cloud 简单实战

## 项目结构

    |--- MicroService Maven 项目主工程
             |
             |
             |--- Hystrix Dashboard 监控端 http://localhost:8030/hystrix.stream
             |
             |
             |          |--- Discovery Eureka 服务发现注册中心 http://localhost:8761
             |          |
             |          |--- Provider User 服务提供端 http://localhost:8001
             |          |
             |          |--- Consumer Movie Ribbon 服务调用端 http://localhost:8010/ribbon/*
             |          |
             |---->|--- Consumer Movie Ribbon Hystrix [ 断路器功能 ]服务调用端 http://localhost:8011/ribbon/* 关闭 Provider User 可以测试 fallback 断路降级
             |          |
             |          |--- Consumer Movie Feign 服务调用端 http://localhost:8020/feign/*
             |          |
             |---->|--- Consumer Movie Feign Hystrix [ 断路器功能 ]服务调用端  http://localhost:8012/feign/*  关闭 Provider User 可以测试 fallback 断路降级
