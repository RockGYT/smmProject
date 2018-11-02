/**
 * FileName: UserServiceImpl
 * Author:   Rock_Guo
 * Date:     2018/3/12 17:03
 * Description: 用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gyt.interfaces.serviceImpl;

import com.gyt.interfaces.mapper.UserMapper;
import com.gyt.interfaces.po.User;
import com.gyt.interfaces.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户〉
 *
 * @author Rock_Guo
 * @create 2018/3/12
 * @since 1.0.0
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapperDao;

    public int insertSelective(User user) {
        return userMapperDao.insertSelective(user);
    }

    public int insert(User user) {
        return userMapperDao.insert(user);
    }

    public User selectByPrimaryKey(Integer id) {
        return userMapperDao.selectByPrimaryKey(id);
    }

}
