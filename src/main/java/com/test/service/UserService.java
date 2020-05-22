package com.test.service;

import com.test.dao.UserDao;
import com.test.domain.User;

import java.util.List;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user){
        userDao.saveUser(user);
    }

    public void updateUse(User user){
        userDao.updateUse(user);
    }

    public void deleteUser(Integer id){
        userDao.deleteUser(id);
    }

    public User findOne(Integer id){
        return userDao.findOne(id);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }
}
