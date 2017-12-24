package com.laboratory.system.user.dao;

import org.springframework.stereotype.Repository;
import com.laboratory.system.user.model.User;

import java.util.List;
import java.util.Map;

/**
 * 用户操作接口
 * Created by Lpan on 2017/7/17.
 */
@Repository
public interface UserDao {
    //添加
    int insert(User model);
    //批量添加
    //
    //根据id 删除
    void delete(String id);
    //根据id 修改激活状态
    void updateStatus(String id);
    //根据id修改
    void update(User user);
    //根据id进行查询
    User selectModel(User userModel);
    //分页查询
    List<User> selectAllByPage(Map<String, Object> paramMap);
    //根据登录用户名和手机号查询用户
    List<User> selectUserByUserName(Map<String, String> paramMap);
}
