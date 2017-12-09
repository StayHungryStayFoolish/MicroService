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

## Feign 配置

feign:

  hystrix:

    enabled: true


默认为true。如果设置为false，Ribbon将不会从Eureka中获得服务列表，而是使用静态配置的服务列表。静态服务列表可使用：<client>.ribbon.listOfServers来指定。参考：http://projects.spring.io/spring-cloud/docs/1.0.3/spring-cloud.html#spring-cloud-ribbon-without-eureka

参考：https://spring.io/guides/gs/client-side-load-balancing/


## 启动方式

1. 启动 Discovery Eureka

2. 启动 Provider User

3. 启动 Consumer Movie Feign Hystrix

4. 访问 http://localhost:8012/feign/1

5. 关闭 Provider User

