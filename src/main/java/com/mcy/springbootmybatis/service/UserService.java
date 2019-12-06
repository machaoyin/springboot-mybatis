package com.mcy.springbootmybatis.service;

import com.mcy.springbootmybatis.entity.User;
import com.mcy.springbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //查询所有，方法名需要和UserMapper.xml中的id对应
    public List<User> findAll(){
        return userMapper.findAll();
    };

    //根据姓名查询
    public List<User> findByName(String name){
        return userMapper.findByName(name);
    };

    //根据用户名模糊查询
    public List<User> findByUsernameLike(String username){
        return userMapper.findByUsernameLike(username);
    };

    //根据id查询
    public User findById(Integer id){
        return userMapper.findById(id);
    };

    //多条件动态查询
    public List<User> find(User user){
        return userMapper.find(user);
    };

    //分页查询
    public List<User> findByPageAll(User user){
        return userMapper.findByPageAll(user);
    };

    //新增
    public void addSave(User user){
        userMapper.addSave(user);
    };

    //修改
    public void update(User user){
        userMapper.update(user);
    };
}
