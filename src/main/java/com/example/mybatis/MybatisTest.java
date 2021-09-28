package com.example.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MybatisTest {
    @Autowired
    UsersDao usersDao;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MybatisConfigure.class);
        UsersDao usersDao = (UsersDao) context.getBean("usersDao");
        System.out.println(usersDao.getAllUsers());
    }
}
