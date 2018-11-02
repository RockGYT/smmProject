package com.gyt.interfaces.service;

import com.gyt.interfaces.po.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int insertSelective(User user);
    int insert(User user);
    User selectByPrimaryKey(Integer id);
}
