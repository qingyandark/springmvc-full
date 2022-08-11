package cn.qingyandark.service.impl;

import cn.qingyandark.domain.Exception.SystemException;
import cn.qingyandark.controller.data.Code;
import cn.qingyandark.mapper.UserMapper;
import cn.qingyandark.domain.User;
import cn.qingyandark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    // 不是错误
    private UserMapper userMapper;

    public boolean save(User user) {
        return userMapper.save(user) > 0;
    }

    public boolean update(User user) {
        return userMapper.update(user) > 0;
    }

    public boolean delete(Integer id) {
        return userMapper.delete(id) > 0;
    }

    public User getById(Integer id) {
        //模拟业务异常，包装成自定义异常
//        if(id == 1){
//            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
//        }
        //模拟系统异常，将可能出现的异常进行包装，转换成自定义异常
//        try{
//            int i = 1/0;
//        }catch (Exception e){
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
//        }
        return userMapper.getById(id);
    }

    public List<User> selectALL() {
        return userMapper.selectALL();
    }
}
