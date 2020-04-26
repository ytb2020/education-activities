package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.BasicsRegionMapper;
import com.ytb.education_activities.modal.BasicsRegion;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IBasicsRegionService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class BasicsRegionServiceImpl extends ServiceImpl<BasicsRegionMapper, com.ytb.education_activities.modal.BasicsRegion> implements IBasicsRegionService {
    public BasicsRegion selectByRegionCode(String regionCode){
        BasicsRegion br=new BasicsRegion();
        return br;
    }

    public ObjectResult<BasicsRegion> basicsRegion(String regionCode) {
        ObjectResult<BasicsRegion> result = new ObjectResult<>();
        QueryWrapper<BasicsRegion> queryWrapper = new QueryWrapper<>();
        if (regionCode != null) {
            queryWrapper.eq("region_code", regionCode);
        }
        BasicsRegion basicsRegion = this.baseMapper.selectOne(queryWrapper);
        result.setData(basicsRegion);
        return result;
    }
}
