package com.mcy.springbootmybatis.controller;

import com.mcy.springbootmybatis.entity.User;
import com.mcy.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //查询所有，方法名需要和UserMapper.xml中的id对应
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    };

    //根据姓名查询
    @RequestMapping("/findByName")
    public List<User> findByName(String name){
        return userService.findByName(name);
    };

    //根据用户名模糊查询
    @RequestMapping("/findByUsernameLike")
    public List<User> findByUsernameLike(String username){
        return userService.findByUsernameLike(username);
    };

    //根据id查询用户对象
    @RequestMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }

    //多条件动态查询
    @RequestMapping("/find")
    public List<User> find(User user){
        return userService.find(user);
    };

    //分页查询
    @RequestMapping("/findByPageAll")
    public List<User> findByPageAll(User user){
        return userService.findByPageAll(user);
    };

    //新增
    @RequestMapping("/addSave")
    public String addSave(){
        User user = new User();
        user.setName("张三");
        user.setUsername("admin");
        user.setPassword("admin");
        userService.addSave(user);
        user.setName("李四");
        user.setUsername("123456");
        user.setPassword("123456");
        userService.addSave(user);
        user.setName("王五");
        user.setUsername("user");
        user.setPassword("123456");
        userService.addSave(user);
        return "数据保存成功！";
    };

    //修改
    @RequestMapping("/update")
    public String update(){
        User user = userService.findById(1);
        user.setName("诸葛亮");
        userService.update(user);
        return "修改成功！";
    };
}
