package com.guangc.library.library.web.controller;

import com.guangc.library.library.bean.User;
import com.guangc.library.library.service.IUserService;
import com.guangc.library.library.utils.Message;
import com.guangc.library.library.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangcheng
 * @date 2019/5/10 13:25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("findAllUser")
    public Message findAllUser(){
        return MessageUtil.success(userService.findAllUser());
    }

//    @GetMapping(value = "findUserByCondition")
//    public Message findUserByCondition(User user){
//        return MessageUtil.success(userService.findUserByCondition(user));
//    }

    @GetMapping(value = "findUserById")
    public Message findUserById(Integer id){
        return MessageUtil.success(userService.findUserById(id));
    }

    @PostMapping("addOrUpdateUser")
    public void addOrUpdateUser(User user){
        userService.addOrUpdateUser(user);
    }

    @GetMapping("deleteUser")
    public void deleteUser(Integer id){
        userService.deleteUser(id);
    }

    @GetMapping("recharge")
    public void recharge(Integer id,Double rmb){
        userService.recharge(id,rmb);
    }

    @GetMapping("consumption")
    public void consumption(Integer id,Double rmb){
        userService.consumption(id,rmb);
    }
}
