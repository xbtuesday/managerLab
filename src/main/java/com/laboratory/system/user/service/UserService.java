package com.laboratory.system.user.service;
import com.laboratory.system.user.dao.UserDao;
import com.laboratory.system.user.dao.UserDao;
import com.laboratory.system.user.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 用户管理服务层
 * Created by Lpan on 2017/7/17.
 */
@Service
@Transactional
public class UserService {
    private Logger logger = Logger.getLogger(UserService.class);
    @Autowired
    private UserDao userDao;

    public int insert(User model){
        return userDao.insert(model);
    }
    //批量添加
    //
    //根据id 删除
    public void delete(String id){
        userDao.delete(id);
    }
    //根据id 修改激活状态
    public void updateStatus(String id){
        userDao.updateStatus(id);
    }
    //根据id修改
    public void update(User model){
        userDao.update(model);
    }
    //根据id进行查询
    public User selectModel(User userModel){
       return userDao.selectModel(userModel);
    }
    //根据登录名手机号查询用户是否存在
    public List<User> selectUserByUserName(Map<String,String> paramMap){
        return userDao.selectUserByUserName(paramMap);
    }
    //分页查询
    public List<User> selectAllByPage(Map<String,Object> paramMap){
        return userDao.selectAllByPage(paramMap);
    }
}
