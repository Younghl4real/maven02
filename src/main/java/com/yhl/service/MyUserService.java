package com.yhl.service;

import com.yhl.pojo.MyUser;

import java.util.List;

public interface MyUserService
{
    public List<MyUser> selectUserByName(MyUser myUser);
}
