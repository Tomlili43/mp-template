package com.itheima.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.itcast.mp.MpApplication;
import cn.itcast.mp.pojo.User;
import cn.itcast.mp.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = MpApplication.class)
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    //查询所有
    @Test
    public void testSelectAll(){
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }

    //查询一个
    @Test
    public void testSelectOne(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    //保存
    @Test
    public void testSave(){
        User user = new User();
        user.setUserName("xiaozhao");
        user.setAge(40);
        user.setPassword("xiaozhao");
        user.setName("小赵");
        user.setEmail("xiaozhao@email.com");
        userMapper.insert(user);
    }

    //修改
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1228242594492923909l);
        user.setName("老赵");
        userMapper.updateById(user);
    }

    //删除
    @Test
    public void testDelete(){
        int i = userMapper.deleteById(1228242594492923909l);
    }

}




