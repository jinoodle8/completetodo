package com.study.Springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.Springboot.dao.UserDAO;
import com.study.Springboot.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserDAO userDAO;

    @RequestMapping("/test/insert")
    public String testInsert(
            @RequestParam("id") String id,
            @RequestParam("pw") String pw
    ) {
        int result = userService.setUser(id, pw);
        System.out.println("insert 결과 : " + result);

        return "users/login";

    }

}