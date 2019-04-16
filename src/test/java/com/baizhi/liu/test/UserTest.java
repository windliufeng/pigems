package com.baizhi.liu.test;

import com.baizhi.liu.Application;
import com.baizhi.liu.dao.UserDAO;
import com.baizhi.liu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserTest {
    @Resource
   private UserDAO userDAO;



    @Test
    public void TestSelectAll(){
        List<User> users = userDAO.selectAll();
        for (User user : users) {
            System.out.println(user);

        }

    }
}
