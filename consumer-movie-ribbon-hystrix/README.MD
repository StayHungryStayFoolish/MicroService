# Ribbon - Hystrix

## 版本依赖

    <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-starter-eureka</artifactId>
        </dependency>

        <!-- 整合ribbon -->
        <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-starter-ribbon</artifactId>
        </dependency>

        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

        <!-- 整合hystrix -->
        <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-starter-hystrix</artifactId>
        </dependency>

## 启动服务

1. 启动注册中心：discovery-eureka

2. 启动服务提供方：provider-user

3. 启动服务消费方：consumer-movie-ribbon-hystrix

4. 访问：http://localhost:8011/ribbon/1 获得结果：{"id":1,"username":"Tom","age":12}

5. 关闭服务提供方：microservice-provider-user，访问http://localhost:8011/ribbon/1 ，获得结果：{"id":-1,"username":"default username","age":0}，另外日志打印：c.i.c.s.u.service.RibbonHystrixService : 异常发生，进入fallback方法，接收的参数：id = 1 。

## 文本式监控

http://localhost:8011/hystrix.stream

可以看到类似：

ping:

data: {"type":"HystrixCommand","name":"findById","group":"RibbonHystrixService","currentTime":1472658867784,"isCircuitBreakerOpen":false,"errorPercentage":0,"errorCount":0,"requestCount":0,"rollingCountBadRequests":0....}

并且会不断刷新以获取实时监控数据。但纯文本输出，可读性太差。

建议使用 Hystrix Dashboard 具有可视化页面

**Feign-Hystrix 没有上述功能**