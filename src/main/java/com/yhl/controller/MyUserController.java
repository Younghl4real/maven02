package com.yhl.controller;

import com.yhl.pojo.MyUser;
import com.yhl.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class MyUserController {
@Autowired
    private MyUserService myUserService;
@RequestMapping("selectByName")
    public String selectByName(MyUser myUser, Model model) {
        List<MyUser> list = myUserService.selectUserByName(myUser);
        model.addAttribute("users", list);
        return "userList";
    }
}
