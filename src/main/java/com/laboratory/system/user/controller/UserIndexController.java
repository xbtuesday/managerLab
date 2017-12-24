package com.laboratory.system.user.controller;

import com.laboratory.system.user.model.User;
import com.laboratory.system.user.service.UserService;
import com.laboratory.utils.MD5Utils;
import com.laboratory.utils.MapUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * user login  loginout
 * Created by Lpan on 2017/12/22.
 */
@Controller
@RequestMapping("/system")
public class UserIndexController {
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        Map<String, String> mapParams = MapUtils.getMapParams(request);
        boolean flag = MapUtils.isEmptyS(mapParams);
        //map 不为空
        if(flag){
            //根据用户名查询是否有该用户
            String username = mapParams.get("userName");
            String password = mapParams.get("password");
            List<User> users = userService.selectUserByUserName(mapParams);
            if(null != users && users.size() > 0){
                User user = users.get(0);
                if(user.getPassword().equals(MD5Utils.encode(password)) && user.getUserName().equals(username)){
                    //用户名密码正确
                    UsernamePasswordToken token = new UsernamePasswordToken(username, password);
                    Subject currentUser = SecurityUtils.getSubject();
                    currentUser.login(token);

                }else{
                    //用户名密码不正确



                }
            }
        }
        return null;
    }



}
