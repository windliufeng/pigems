package com.baizhi.liu.serviceImpl;

import com.baizhi.liu.dao.UserDAO;
import com.baizhi.liu.entity.User;
import com.baizhi.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> selectAll() {
        List<User> users = userDAO.selectAll();
        return users;
    }
}
