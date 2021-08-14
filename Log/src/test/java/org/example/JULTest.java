package org.example;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

public class JULTest {

    @Test
    public void testQuick() {
        //1、获取日志记录器对象Logger
        Logger logger = Logger.getLogger("org.example.JULTest");
        //2、日志记录的输出过程
        logger.info("hello jul");

        //通用方法进行日志记录   2个参数，带日志级别
        logger.log(Level.INFO,"info msg");
        //通过占位符，方式输出变量值
        String name="godlstine";

        Integer age=13;

        logger.log(Level.INFO,"用户信息：{0}，{1}",new Object[]{name,age});

    }

    //日志级别
    //不同的级别对应的值不同，值越大的级别也越大，INFO对应的值为800,情况越坏，对应的日志级别越高
    //ALL是最小的日志级别，对应的数值最小，OFF是最大的日志级别，对应的是最大的int
    @Test
    public void testLevel(){
        Logger logger = Logger.getLogger("org.example.JULTest");
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");//jul默认的日志级别是info,比info级别高的输出，低的不输出
        logger.config("config");
        logger.fine("fin");
        logger.finer("finer");
        logger.finest("finest");

    }

    //自定义日志级别
    @Test
    public void testdefineLevel() throws IOException {
        Logger logger = Logger.getLogger("org.example.JULTest");

        //关闭系统默认配置
        logger.setUseParentHandlers(false);

        //自定义配置日志级别

        //创建ConsoleHandler对象
        ConsoleHandler handler = new ConsoleHandler();
        
        //创建简单格式转换对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();

        //进行关联
        handler.setFormatter(simpleFormatter);
        logger.addHandler(handler);

        //配置日志具体的级别
        logger.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);

        //创建fileHandler  文件日志输出
        FileHandler fileHandler = new FileHandler("D:\\goldstine\\stine.log");
        fileHandler.setFormatter(simpleFormatter);
        //进行关联
        logger.addHandler(fileHandler);



        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");//jul默认的日志级别是info,比info级别高的输出，低的不输出
        logger.config("config");
        logger.fine("fin");
        logger.finer("finer");
        logger.finest("finest");
    }

    //Logger对象父子关系
    @Test
    public void testLoggerParent(){
        Logger logger1 = Logger.getLogger("com.example");
        Logger logger2 = Logger.getLogger("com");//logger1是logger2的子对象
        System.out.println(logger1.getParent()==logger2);
        System.out.println(logger2.getParent()+",name:"+logger2.getParent().getName());
        //LogManager$RootLogger所有日志记录器的顶级父元素，name为空字符串""

        //关闭系统默认配置
        logger2.setUseParentHandlers(false);

        //自定义配置日志级别

        //创建ConsoleHandler对象
        ConsoleHandler handler = new ConsoleHandler();

        //创建简单格式转换对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();

        //进行关联
        handler.setFormatter(simpleFormatter);
        logger2.addHandler(handler);

        //配置日志具体的级别
        logger2.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);
//将父对象的日志级别设置为最小ALL,对应的子对象的日志级别也会变为ALL,所以对应的logger1的日志级别输出为所有级别的日志
        logger1.severe("severe");
        logger1.warning("warning");
        logger1.info("info");//jul默认的日志级别是info,比info级别高的输出，低的不输出
        logger1.config("config");
        logger1.fine("fin");
        logger1.finer("finer");
        logger1.finest("finest");
    }

    //配置文件的日志级别输出
    @Test
    public void testProperties() throws IOException {
        //1、读取配置文件，通过类加载器
//        InputStream ins = JULTest.class.getClassLoader().getResourceAsStream("logging.properties");
//        //2、创建LoggerManager
//        LogManager logManager = LogManager.getLogManager();
//
//        //3、通过LogManager加载配置文件
//        logManager.readConfiguration(ins);

        //创建日志记录器
        Logger logger = Logger.getLogger("com.example");//使用的是自定义日志级别CONFIG
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");


        Logger logger2 = Logger.getLogger("test");  //依旧使用的是默认的日志界别信息ALL,会输出所有的日志信息
        logger2.severe("severe test");
        logger2.warning("warning test");
        logger2.info("info test");
        logger2.config("config test");
        logger2.fine("fine test");
        logger2.finer("finer test");
        logger2.finest("finest test");
    }


}
