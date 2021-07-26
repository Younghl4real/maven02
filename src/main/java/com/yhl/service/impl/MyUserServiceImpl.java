package com.yhl.service.impl;

import com.yhl.dao.MyUserDao;
import com.yhl.pojo.MyUser;
import com.yhl.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MyUserServiceImpl implements MyUserService
{
    @Autowired
private MyUserDao myUserDao;
    @Override
public List<MyUser> selectUserByName(MyUser myUser){
    return myUserDao.selectUserByName(myUser);
    };
}




