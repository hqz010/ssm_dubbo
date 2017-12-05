package cn.javaxxw.controller;

import cn.javaxxw.model.User;
import cn.javaxxw.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsumer {
    private static final Log log = LogFactory.getLog(DubboConsumer.class);



    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-context.xml"});
            context.start();


        } catch (Exception e) {
            log.error("== DubboConsumer context start error:",e);
        }
    }
}
