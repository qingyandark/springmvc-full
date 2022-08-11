package cn.qingyandark.service;

import cn.qingyandark.config.SpringConfig;
import cn.qingyandark.domain.User;
import cn.qingyandark.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectAll(){
        List<User> users = userMapper.selectALL();
        System.out.println(users);
    }
}
