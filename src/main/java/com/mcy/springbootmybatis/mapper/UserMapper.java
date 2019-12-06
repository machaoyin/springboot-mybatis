package com.mcy.springbootmybatis.mapper;

import com.mcy.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有，方法名需要和UserMapper.xml中的id对应
    public List<User> findAll();

    //根据姓名查询
    public List<User> findByName(String name);

    //根据用户名模糊查询
    public List<User> findByUsernameLike(String username);

    //根据id查询
    public User findById(Integer id);

    //多条件动态查询
    public List<User> find(User user);

    //分页查询
    public List<User> findByPageAll(User user);

    //新增
    public void addSave(User user);

    //修改
    public void update(User user);
}

