package LearningCode0928.service.impl;

import LearningCode0928.dao.UserDao;
import LearningCode0928.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.save();
    }
}
