package com.study.Springboot.service;

import com.study.Springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.Springboot.dao.UserDAO;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public int setUser(String id, String pw) {

        int result = userDAO.insertUser(id, pw);

        return result;
    }



}