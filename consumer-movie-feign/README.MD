# Feign

# 版本依赖

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

# 实现方式

@FeiClient(value="实例名字")
public interface XXXX{

    @RequestMapping(value="对应实例的 controller 路由地址")
    [AbstractMethid] xxxx();
}

# http://localhost:8020/feign/1


@Autowired
DiscoveryClient discoveryClient;

// 获取当前调用的实例名字
discoveryClient.services();

