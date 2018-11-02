/**
 * FileName: UserServiceTest
 * Author:   Rock_Guo
 * Date:     2018/3/13 15:48
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gyt.interfaces.test;

import com.gyt.interfaces.po.User;
import com.gyt.interfaces.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 〈一句话功能简述〉<br> 
 * 〈测试类〉
 *
 * @author Rock_Guo
 * @create 2018/3/13
 * @since 1.0.0
 */
public class UserServiceTest extends SpringTestCase {

    @Autowired
    private UserService userService;

    Logger logger = Logger.getLogger(UserServiceTest.class);

    @Test
    public void  selectUserByIdTest(){
        User user = userService.selectByPrimaryKey(1);
        System.out.println(user.toString());
        logger.debug("查询结果："+user.toString());
    }

}
