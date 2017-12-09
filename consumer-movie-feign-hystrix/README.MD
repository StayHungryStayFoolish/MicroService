# Feign - Hystrix

## 版本依赖

            <!-- Eureka 依赖 -->
    		<dependency>
    			<groupId>org.springframework.cloud</groupId>
    			<artifactId>spring-cloud-starter-eureka</artifactId>
    			<version>1.4.0.RELEASE</version>
    		</dependency>
    		<!-- Feign 负载均衡 -->
    		<dependency>
    			<groupId>org.springframework.cloud</groupId>
    			<artifactId>spring-cloud-starter-feign</artifactId>
    			<version>1.4.0.RELEASE</version>
    		</dependency>
    		<!-- Spring 监控 -->
    		<dependency>
    			<groupId>org.springframework.boot</groupId>
    			<artifactId>spring-boot-starter-actuator</artifactId>
    		</dependency>
    		<!-- Hystrix 断路器 -->
    		<dependency>
    			<groupId>org.springframework.cloud</groupId>
    			<artifactId>spring-cloud-starter-hystrix</artifactId>
    		</dependency>

## Feign Hystrix 结构

- 主程序

@EnableCircuitBreaker 开启断路器

@EnableFeignClients 开启 Feign 伪 HTTP 客户端

- FallBack 接口

@FeignClient(name = "调用实例名字" ,fallback = "该接口实现类")

- FallBack 实现类

建立使用 静态内部类

@Component 注解为组件

Override FallBack 的逻辑讲解方法

**当服务调用异常时，触发逻辑降级服务，调用 FallBack 重写的逻辑降级方法**



## 启动方式

