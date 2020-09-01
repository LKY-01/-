//package com.project.demo;
//
//import com.project.demo.Bean.User;
//import com.project.demo.mapper.UserMapper;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Arrays;
//import java.util.List;
//
//@SpringBootTest
//class DemoApplicationTests {
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(4, userList.size());
//        userList.forEach(System.out::println);
//    }
//    @Test
//    void selectById() {
//        System.out.println(("----- select!!!!!!!!!!!!!!------"));
//        User user = userMapper.selectById(1);
//        System.out.println(user);
//    }
//    @Test
//    void selectByIds() {
//        System.out.println(("----- select  shuzi!!!!!!!!!!!!!!------"));
//        List<Integer> idsList = Arrays.asList(1, 2, 3);
//        List<User> userList = userMapper.selectBatchIds(idsList);
//        userList.forEach(System.out::println);
//    }
////    根据id更新数据
//    @Test
//    void updateById() {
//        User user = new User();
//        user.setId(1);
//        user.setIsDelete(0);
//        user.setUserAccount("18");
//        user.setUserPassword("no");
//        int rows = userMapper.updateById(user);
//        System.out.println("影响记录数：" + rows);
//    }
//
//}