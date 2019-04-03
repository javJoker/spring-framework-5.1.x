package com;

import com.condition.TestCondition;
import com.dao.UserDao;
import com.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dao")
@Conditional(TestCondition.class)
public class Appconfig {

}
