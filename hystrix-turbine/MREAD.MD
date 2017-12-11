# Turbine

## 版本依赖

            <!-- Turbine 监控聚合依赖 -->
    		<dependency>
    			<groupId>org.springframework.cloud</groupId>
    			<artifactId>spring-cloud-starter-turbine</artifactId>
    			<version>1.4.0.RELEASE</version>
    		</dependency>
    		<!-- Turbine 监控聚合 -->
    		<dependency>
    			<groupId>org.springframework.cloud</groupId>
    			<artifactId>spring-cloud-netflix-turbine</artifactId>
    			<version>1.4.0.RELEASE</version>
    		</dependency>
    		<!-- Spring 监控 -->
    		<dependency>
    			<groupId>org.springframework.boot</groupId>
    			<artifactId>spring-boot-starter-actuator</artifactId>
    		</dependency>

##

启动失败

        2017-12-11 10:52:19.427  WARN 1622 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration': Unsatisfied dependency expressed through field 'externalConfigurations'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'configurableEnvironmentConfiguration' defined in class path resource [org/springframework/cloud/netflix/archaius/ArchaiusAutoConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.netflix.archaius.ConfigurableEnvironmentConfiguration]: Circular reference involving containing bean 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration' - consider declaring the factory method as static for independence from its containing instance. Factory method 'configurableEnvironmentConfiguration' threw exception; nested exception is java.lang.NoClassDefFoundError: com/netflix/config/DeploymentContext$ContextKey
        2017-12-11 10:52:19.428  INFO 1622 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
        2017-12-11 10:52:19.445  INFO 1622 --- [           main] utoConfigurationReportLoggingInitializer :

        Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
        2017-12-11 10:52:19.458 ERROR 1622 --- [           main] o.s.boot.SpringApplication               : Application startup failed

        org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration': Unsatisfied dependency expressed through field 'externalConfigurations'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'configurableEnvironmentConfiguration' defined in class path resource [org/springframework/cloud/netflix/archaius/ArchaiusAutoConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.netflix.archaius.ConfigurableEnvironmentConfiguration]: Circular reference involving containing bean 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration' - consider declaring the factory method as static for independence from its containing instance. Factory method 'configurableEnvironmentConfiguration' threw exception; nested exception is java.lang.NoClassDefFoundError: com/netflix/config/DeploymentContext$ContextKey
        	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:588) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:366) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1264) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:553) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:761) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:867) ~[spring-context-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:543) ~[spring-context-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
        	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
        	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
        	at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
        	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
        	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
        	at com.microservice.HystrixTurbineApplication.main(HystrixTurbineApplication.java:18) [classes/:na]
        Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'configurableEnvironmentConfiguration' defined in class path resource [org/springframework/cloud/netflix/archaius/ArchaiusAutoConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.netflix.archaius.ConfigurableEnvironmentConfiguration]: Circular reference involving containing bean 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration' - consider declaring the factory method as static for independence from its containing instance. Factory method 'configurableEnvironmentConfiguration' threw exception; nested exception is java.lang.NoClassDefFoundError: com/netflix/config/DeploymentContext$ContextKey
        	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:599) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1173) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1067) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:513) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:208) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.DefaultListableBeanFactory.addCandidateEntry(DefaultListableBeanFactory.java:1316) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1300) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveMultipleBeans(DefaultListableBeanFactory.java:1180) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1096) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1066) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:585) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	... 19 common frames omitted
        Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.netflix.archaius.ConfigurableEnvironmentConfiguration]: Circular reference involving containing bean 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration' - consider declaring the factory method as static for independence from its containing instance. Factory method 'configurableEnvironmentConfiguration' threw exception; nested exception is java.lang.NoClassDefFoundError: com/netflix/config/DeploymentContext$ContextKey
        	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:189) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:588) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	... 34 common frames omitted
        Caused by: java.lang.NoClassDefFoundError: com/netflix/config/DeploymentContext$ContextKey
        	at org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration.configureArchaius(ArchaiusAutoConfiguration.java:150) ~[spring-cloud-netflix-core-1.4.0.RELEASE.jar:1.4.0.RELEASE]
        	at org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration.configurableEnvironmentConfiguration(ArchaiusAutoConfiguration.java:103) ~[spring-cloud-netflix-core-1.4.0.RELEASE.jar:1.4.0.RELEASE]
        	at org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration$$EnhancerBySpringCGLIB$$ff00d3a7.CGLIB$configurableEnvironmentConfiguration$1(<generated>) ~[spring-cloud-netflix-core-1.4.0.RELEASE.jar:1.4.0.RELEASE]
        	at org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration$$EnhancerBySpringCGLIB$$ff00d3a7$$FastClassBySpringCGLIB$$85af9a09.invoke(<generated>) ~[spring-cloud-netflix-core-1.4.0.RELEASE.jar:1.4.0.RELEASE]
        	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228) ~[spring-core-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:358) ~[spring-context-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	at org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration$$EnhancerBySpringCGLIB$$ff00d3a7.configurableEnvironmentConfiguration(<generated>) ~[spring-cloud-netflix-core-1.4.0.RELEASE.jar:1.4.0.RELEASE]
        	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_112]
        	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_112]
        	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_112]
        	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_112]
        	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:162) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
        	... 35 common frames omitted
        Caused by: java.lang.ClassNotFoundException: com.netflix.config.DeploymentContext$ContextKey
        	at java.net.URLClassLoader.findClass(URLClassLoader.java:381) ~[na:1.8.0_112]
        	at java.lang.ClassLoader.loadClass(ClassLoader.java:424) ~[na:1.8.0_112]
        	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331) ~[na:1.8.0_112]
        	at java.lang.ClassLoader.loadClass(ClassLoader.java:357) ~[na:1.8.0_112]
        	... 47 common frames omitted

