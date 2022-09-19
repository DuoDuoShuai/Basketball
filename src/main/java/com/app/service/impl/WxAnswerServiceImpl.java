package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxAnsewrMapper;
import com.app.service.WxAnswerService;
import com.yjy.dto.LayUiDto;
import com.yjy.mapper.AnsewrMapper;
import com.yjy.model.Ansewr;
import com.yjy.service.AnswerService;
import com.yjy.vo.JsonPageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 徐晓瑞
 * @date 2022/9/5 16:16
 * @describe:
 */

@Service
public class WxAnswerServiceImpl implements WxAnswerService {

    @Resource
    private WxAnsewrMapper WAansewrMapper;

    /**
     * 查询全部
     * @param wxAllDto
     * @return
     */
    @Override
    public JsonPageResult list(WxAllDto wxAllDto) {
        //判断是否有数据
        Integer count = WAansewrMapper.count(wxAllDto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Ansewr> list = WAansewrMapper.list(wxAllDto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }

}
