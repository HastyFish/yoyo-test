package com.example.demo.service.impl;

import com.example.demo.dao.TestUserDao;
import com.example.demo.entity.TestUser;
import com.example.demo.service.LoginService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TestUserDao testUserDao;

    @Override
    public String login(TestUser user) {
        String password = user.getPassword();
        String userToken = testUserDao.selectSelective(user);
        if (StringUtils.isEmpty(userToken)) {
            return null;
        }
        if (md5(password).equals(userToken)) {
            return userToken;
        }
        return null;
    }

    private String md5(String text){
        return DigestUtils.md5Hex(text);
    }
}
