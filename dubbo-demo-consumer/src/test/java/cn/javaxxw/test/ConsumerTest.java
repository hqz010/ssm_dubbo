package cn.javaxxw.test;

import com.alibaba.dubbo.rpc.RpcContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import cn.javaxxw.model.User;
import cn.javaxxw.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-context.xml")
public class ConsumerTest {
    @Autowired
    private UserService userService;

    @Test
    public void addUserTest()
    {
        String userName="jason";
        String password="123456";
        String nickName="hqz";
        String serverIP=null;
        User user=null;
        for(int i=0;i<1000;i++) {
            user = userService.addUser(userName, password, nickName);
            //System.out.println(user.getUserName().toString());
            serverIP = RpcContext.getContext().getRemoteHost(); // 获取当前线程最后一次调用的提供方IP地址
            System.out.println(i+":"+serverIP);
        }
    }
}
