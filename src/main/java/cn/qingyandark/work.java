package cn.qingyandark;

import cn.qingyandark.config.SpringConfig;
import cn.qingyandark.domain.User;
import cn.qingyandark.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class work {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        List<User> users = userService.selectALL();
        System.out.println(users.toString());
    }
}