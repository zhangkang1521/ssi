package org.zk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zk.dao.UserDao;
import org.zk.model.User;

/**
 * Created by zhangkang on 2017/9/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/list")
    public String list() {
        User user = userDao.findById(1);
        System.out.println(user);
        return "user/list";
    }
}
