package com.example.mybatis;

import com.example.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UsersDao {

    @Select("select * from users")
    public List<Users> getAllUsers();
}
