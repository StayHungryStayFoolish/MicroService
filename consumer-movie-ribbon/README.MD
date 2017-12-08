# Ribbon

## 版本依赖

        <!-- Eureka 依赖 -->
        <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka</artifactId>
			<version>1.4.0.RELEASE</version>
		</dependency>
		<!-- Ribbon 依赖 -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-ribbon</artifactId>
			<version>1.4.0.RELEASE</version>
		</dependency>
		<!-- Spring 监控-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

## 实现方式

主程序：注册 Bean --> RestTemplate

```java
	@Bean
    	@LoadBalanced
    	public RestTemplate restTemplate() {
    		return new RestTemplate();
    	}
```

Service 层：注入 RestTemplate

```java
    restTemplate.getForObject("http://调用实例名字/" + 参数，返回类型.class);
```