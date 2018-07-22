package org.zk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zk.dao.UserDao;
import org.zk.model.Result;
import org.zk.model.User;
import org.zk.vo.PermVo;

import java.util.ArrayList;
import java.util.List;

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
        return "user/list";
    }

    @RequestMapping("perm")
    @ResponseBody
    public List<PermVo> queryPerm() {
        List<PermVo> list = new ArrayList<PermVo>();
        PermVo root = new PermVo();
        root.setId(1);
        root.setText("Root");
        root.setChildren(new ArrayList<PermVo>());
        list.add(root);

        for (int i = 2; i <= 3; i++) {
            PermVo permVo = new PermVo();
            permVo.setId(i);
            permVo.setText("a" + i);
            root.getChildren().add(permVo);
        }

        PermVo a2 = root.getChildren().get(0);
        a2.setChildren(new ArrayList<PermVo>());
        for (int i = 4; i <= 10; i++) {
            PermVo permVo = new PermVo();
            permVo.setId(i);
            permVo.setText("aa" + i);
            a2.getChildren().add(permVo);
        }


        return list;
    }

    @RequestMapping("/list2")
    @ResponseBody
    public User list2() {
        return new User();
    }
}
