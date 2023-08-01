package com.study.Springboot.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {

    // xml 내용
    int insertUser(String id, String pw);

}