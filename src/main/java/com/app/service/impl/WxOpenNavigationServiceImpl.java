package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxOpenNavigationMapper;
import com.app.service.WxOpenNavigationService;
import com.yjy.model.Navigation;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
@Service
public class WxOpenNavigationServiceImpl implements WxOpenNavigationService {
    @Autowired
    private WxOpenNavigationMapper wxOpenNavigationMapper;

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
        Integer count = wxOpenNavigationMapper.count(wxAllDto);
        if(count==0){
            return JsonPageResult.successPage();
        }
        List<Navigation> list = wxOpenNavigationMapper.list(wxAllDto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }


}
