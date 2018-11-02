/**
 * FileName: UserController
 * Author:   Rock_Guo
 * Date:     2018/3/12 17:05
 * Description: 用户--控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gyt.interfaces.controller;

import com.gyt.interfaces.po.User;
import com.gyt.interfaces.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户--控制器〉
 *
 * @author Rock_Guo
 * @create 2018/3/12
 * @since 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index.do")
    public String addPage(){
        return "addUser";
    }

    @RequestMapping("/userAdd.do")
    public String UserAdd(User user, Model model){
        if(userService.insert(user)>0){
            model.addAttribute("successMsg", "注册成功！");
            model.addAttribute("name", user.getUserName());
            return "success";//返回的页面N
        }else{
            model.addAttribute("failMsg", "注册失败！");
            return "fail";
        }
    }

}
