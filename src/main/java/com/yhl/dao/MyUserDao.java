package com.yhl.dao;

import com.yhl.pojo.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("myUserDao")
@Mapper
public interface MyUserDao
{
    public List<MyUser> selectUserByName(MyUser myUser);
}
