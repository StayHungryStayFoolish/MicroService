# Feign

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