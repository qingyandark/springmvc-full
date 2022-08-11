package cn.qingyandark.mapper;

import cn.qingyandark.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Insert("insert into tb_mybatis (name) values(#{name})")
    public int save(User user);

    @Update("update tb_mybatis set name = #{name} where id = #{id}")
    public int update(User user);

    @Delete("delete from tb_mybatis where id = #{id}")
    public int delete(Integer id);

    @Select("select * from tb_mybatis where id = #{id}")
    public User getById(Integer id);

    @Select("select * from tb_mybatis")
    List<User> selectALL();


//    @Update("update tb_mybatis set name = #{name} where name = #{prename}")
//    void updateName(@Param("prename") String prename, @Param("name") String name);
}
