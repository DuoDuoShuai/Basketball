package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxOpenSchoolMapper;
import com.app.service.WxOpenSchoolService;
import com.yjy.model.OpenSchool;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/4
 * @Description:
 */
@Service
public class WxOpenSchoolServiceImpl implements WxOpenSchoolService {
    @Autowired
    private WxOpenSchoolMapper wxOpenSchoolMapper;

    /**
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());

    /**
     * 列表+检索
     * @param wxAllDto
     * @return
     */
    @Override
    public JsonPageResult list(WxAllDto wxAllDto) {
        Integer count = wxOpenSchoolMapper.count(wxAllDto);
        if(count==0){
            return JsonPageResult.successPage();
        }
        List<OpenSchool> list = wxOpenSchoolMapper.list(wxAllDto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

}
