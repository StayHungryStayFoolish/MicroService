# Hystrix - Dashboard

## 版本依赖

            <!-- Hystrix Dashboard 监控器仪表盘 -->
    		<dependency>
    			<groupId>org.springframework.cloud</groupId>
    			<artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
    			<version>1.4.0.RELEASE</version>
    		</dependency>
    		<!-- Spring 监控器 -->
    		<dependency>
    			<groupId>org.springframework.boot</groupId>
    			<artifactId>spring-boot-starter-actuator</artifactId>
    		</dependency>

## 启动方式

1. 启动 Discovery Eureka 注册发现服务中心

    - http://localhost:8761

2. 启动 Provider User 服务提供者

    - http://localhost:8001

3. 启动 Consumer Movie Ribbon Hystrix  服务消费者

    - http://localhost:8011/ribbon/1

    - http://localhost:8011/hystrix.stream  文本式监控页面【可读性太差】

4. 要进入服务监控，必须先调用 `一次` API http://localhost:8011/ribbon/1

5. 然后启动 Hystrix Dashboard 服务监控


    - http://localhost:8030/hystrix.stream

    - 输入 http://localhost:8030/hystrix.stream ，设置一个 title。

    - http://想监控的服务:端口/hystrix.stream进行测试

    - 此时，我们可以尝试将microservice-provider-user停止，然后重复访问多次http://localhost:8011/ribbon/1 （20次以上），会发现断路器状态会变为开启。
