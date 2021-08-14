# Java-Log
```
* 相关日志的总结：
	 * 首先有这些日志框架：
	 * 日志门面：JCL(由于扩展性较差，被废弃)   slf4j广泛使用的日志门面  当然log4j基于logback的增强实现也可以作为日志门面，但是一般作为日志实现
	 * 日志实现：log4j  logback log4j2 jul
	 * jul作为java最早的默认的日志实现框架，内置于jdk中，所以不需要导入依赖，直接使用  Logger.getLogger() 直接在jdk/jre中有对应的配置文件logging.properties可以自定义
	 * log4j  作为较早的日志实现框架  通过log4j.properties配置自定义 通过LoggerFactory.getLogger()           log4.properties
	 * logback作为 通过LoggerFactory.getLogger()                                          logback.xml
	 * log4j2作为借鉴logback的优势在log4j的基础上发展而来的 ，是未来使用的主流趋势  LogManager.getLogger();         log4j2.xml
	 *
	 * 所有上面的实践都是用打印日志级别的方式实现的，一般默认的日志级别都是info    好像logback的日志级别是debug   都可以通过配置文件配置
	 *
	 *相关的配置文件基本都是关于  ： 输出日志的格式配置 ;输出日志的位置 【控制台还是日志文件或者是数据库】  ；
	 对应的root Logger   可以自己进行对应的包的Logger日志记录器对象的配置
	 * 相关的细粒度配置：将日志文件进行拆分规则，【按照日志文件的大小；按照日志文件的时间进行拆分】 
	 通过日志级别进行过滤配置   通过异步日志文件的方式加快性能   通过自定义日志Logger对象进行日志输出
	 *
	 * 不同的日志之间的整合：就是日志门面与日志实现之间的搭配
	 * 通过适配器的方式进行整合：【对应的适配器和依赖 记不得 直接查找吧。。。。。】
	 * 通过旧版本日志框架之间的兼容你，不用修改代码   ----》通过桥接器的方式【其实就是一个依赖】
	 *
	 * slf4j-api:依赖，通过该以来使用统一的api操作不同的日志框架
	 * jul+slf4j：只需引入对应的适配器依赖
	 * logback+slf4j: 不需要进行适配 ：直接引入对应的logback以来即可      【这些具体可以参考那张官网的图片，slf4j的适配】
	 * log4j+slf4j:需要引入对应的适配器和log4j-core依赖
	 * 关闭日志门面slf4j:nop依赖
	 *
	 * 【通常来说：适配器与桥接器之间不能共存，会导致栈内存溢出 】
	 *
	 * springboot整合日志：默认使用的是slf4j+logback
	 *
	 * 使用前引入对应的依赖spring-boot-starter-logging
	 *
	 * 通过引入对应的日志框架的配置文件：
	 * log4j2.xml=====>log4j2-spring.xml[由sprinboot进行解析日志文件配置]
	 * logback.xml====>logback-spring.xml
	 * jul.properties
	 *
	 *
	 * 通过将默认的spring-boot-starter-logging  exclude，然后引入其他的日志实现框架，继续配置
	 *
	 * 【注】其他一些细节
	 * 将日志框架与tomcat进行整合
```
