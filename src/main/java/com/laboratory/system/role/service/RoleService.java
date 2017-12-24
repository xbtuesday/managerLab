package com.laboratory.system.role.service;

import com.laboratory.system.role.dao.RoleMapper;
import com.laboratory.system.role.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * user service
 * Created by Lpan on 2017/12/20.
 */
@Service
@Transactional
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    /**
     *
     *  根据主键删除
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    public int deleteByPrimaryKey(Integer id){
        return roleMapper.deleteByPrimaryKey(id);
    }

    /**
     *  添加一个角色
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    public int insert(Role role){
        return roleMapper.insert(role);
    }

    /**
     *根据主键查询
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    public Role selectByPrimaryKey(Integer id){
        return roleMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据主键修改状态
     * @param param
     */
    public void updateStatus(Map<String,String> param){
        roleMapper.updateStatus(param);
    }

    /**
     *  查询分页查询
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    public List<Role> selectAllByParam(Map<String,String> param){
        return roleMapper.selectAll(param);
    }

    /**
     *  更新
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    public int updateByPrimaryKey(Role role){
        return roleMapper.updateByPrimaryKey(role);
    }

}
