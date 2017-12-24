package com.laboratory.system.resource.service;

import com.laboratory.system.resource.dao.ResourcesMapper;
import com.laboratory.system.resource.model.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * resourceService
 * Created by Lpan on 2017/12/22.
 */
@Service
@Transactional
public class ResourceService {
     @Autowired
    private ResourcesMapper resourceMapper;

    /**
     *
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(Integer id){
        return resourceMapper.deleteByPrimaryKey(id);
    }
    /**
     *
     * @mbg.generated Tue Dec 12 16:53:29 CST 2017
     */
    public int insert(Resources record){
        return resourceMapper.insert(record);
    }

    /**
     *
     * @mbg.generated Tue Dec 12 16:53:29 CST 2017
     */
    public Resources selectByPrimaryKey(Integer id){
        return resourceMapper.selectByPrimaryKey(id);
    }

    /**
     *
     * @mbg.generated Tue Dec 12 16:53:29 CST 2017
     */
    public List<Resources> selectAll(){
        return resourceMapper.selectAll();
    }

    /**
     *
     * @mbg.generated Tue Dec 12 16:53:29 CST 2017
     */
    public int updateByPrimaryKey(Resources record){
        return resourceMapper.updateByPrimaryKey(record);
    }
}
