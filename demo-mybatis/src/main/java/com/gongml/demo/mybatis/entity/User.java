package com.gongml.demo.mybatis.entity;

import com.gongml.demo.mybatis.enums.UserSexEnum;
import lombok.Data;

/**
 * @program: demo
 * @description:
 * @author: Gongml
 * @create: 2018-12-21 15:05
 **/
@Data
public class User {
    private Long id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;
}
