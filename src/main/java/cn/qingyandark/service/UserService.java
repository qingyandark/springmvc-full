package cn.qingyandark.service;

import cn.qingyandark.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    public boolean save(User user);

    public boolean update(User user);

    public boolean delete(Integer id);

    public User getById(Integer id);

    List<User> selectALL();
}
