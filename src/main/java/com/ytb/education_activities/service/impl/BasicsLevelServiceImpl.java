package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.BasicsLevelMapper;
import com.ytb.education_activities.modal.BasicsLevel;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IBasicsLevelService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class BasicsLevelServiceImpl extends ServiceImpl<BasicsLevelMapper, BasicsLevel> implements IBasicsLevelService {
    public BasicsLevel selectByLevelCode(String levelCode){
        BasicsLevel bl=new BasicsLevel();
        return bl;
    }

    public ObjectResult<BasicsLevel> basicsLevel(String levelCode) {
        ObjectResult<BasicsLevel> result = new ObjectResult<>();
        QueryWrapper<BasicsLevel> queryWrapper = new QueryWrapper<>();
        if (levelCode != null) {
            queryWrapper.eq("level_code", levelCode);
        }
        BasicsLevel basicsLevel = this.baseMapper.selectOne(queryWrapper);
        result.setData(basicsLevel);
        return result;
    }
}
