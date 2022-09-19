package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxProblemMapper;
import com.app.service.WxProblemService;
import com.yjy.dto.LayUiDto;
import com.yjy.mapper.ProblemMapper;
import com.yjy.model.Problem;
import com.yjy.service.ProblemService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 徐晓瑞
 * @date 2022/9/5 16:15
 * @describe:
 */

@Service
public class WxproblemServiceImpl implements WxProblemService {

    @Autowired
    private WxProblemMapper wxProblemMapper;

    /**
     * 查询全部
     * @param wxAllDto
     * @return
     */
    @Override
    public JsonPageResult list(WxAllDto wxAllDto) {
        //判断是否有数据
        Integer count = wxProblemMapper.count(wxAllDto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Problem> list = wxProblemMapper.list(wxAllDto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }
}
