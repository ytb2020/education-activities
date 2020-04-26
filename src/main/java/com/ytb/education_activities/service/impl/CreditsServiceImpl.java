package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.CreditsMapper;
import com.ytb.education_activities.modal.Credits;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.ICreditsService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:02
 */
@Service
public class CreditsServiceImpl extends ServiceImpl<CreditsMapper, Credits> implements ICreditsService {
    public Credits selectByCreditCode(Integer creditCode){
        Credits xfhz=new Credits();
        return xfhz;
    }
    /**
     * 教师学分年度汇总表查询
     */
    public ObjectResult<Credits> credits(Integer creditCode){
        ObjectResult<Credits> result=new ObjectResult<>();
        QueryWrapper<Credits> queryWrapper=new QueryWrapper<>();
        if(creditCode!=null){
            queryWrapper.eq("credit_code",creditCode);
        }
        Credits credits =this.baseMapper.selectOne(queryWrapper);
        System.out.println(credits);
        result.setData(credits);
        return result;
    }
}
