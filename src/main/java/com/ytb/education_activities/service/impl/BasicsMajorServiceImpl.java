package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.BasicsMajorMapper;
import com.ytb.education_activities.modal.BasicsMajor;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IBasicsMajorService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class BasicsMajorServiceImpl extends ServiceImpl<BasicsMajorMapper, BasicsMajor> implements IBasicsMajorService {
    public BasicsMajor selectByMajorCode(String majorCode){
        BasicsMajor bm=new BasicsMajor();
        return bm;
    }

    public ObjectResult<BasicsMajor> basicsMajor(String majorCode) {
        ObjectResult<BasicsMajor> result = new ObjectResult<>();
        QueryWrapper<BasicsMajor> queryWrapper = new QueryWrapper<>();
        if (majorCode != null) {
            queryWrapper.eq("major_code", majorCode);
        }
        BasicsMajor basicsMajor = this.baseMapper.selectOne(queryWrapper);
        result.setData(basicsMajor);
        return result;
    }
}
