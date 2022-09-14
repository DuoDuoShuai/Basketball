package com.app.support;

import com.app.dto.WxAllDto;
import com.app.mapper.WxEnrollMapper;
import com.yjy.model.Enroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/9
 * @Description:
 */
@Component
public class WxEnrollSupport {
    @Autowired
    private WxEnrollMapper wxEnrollMapper;

    /**
     * 接口--查询学员不在班级学员表中的报名记录
     * @return
     */
    public List<Enroll> listByGrade(WxAllDto wxAllDto){
        return wxEnrollMapper.listByGrade(wxAllDto);
    }

}
