package com.yjy.service.impl;/**
 * @author 徐晓瑞
 * @create 2022/9/1 10:29
 * @describe
 */

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.EnrollMapper;
import com.yjy.model.Admin;
import com.yjy.model.Enroll;
import com.yjy.service.EnrollService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 徐晓瑞
 * @date 2022/9/1 10:29
 * @describe:
 */

@Service
public class EnrollServiceImpl implements EnrollService {

    @Autowired
    private EnrollMapper enrollMapper;

    /**
     * 报名记录信息展示
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        //判断是否有数据
        Integer count = enrollMapper.count(dto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Enroll> list = enrollMapper.list(dto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }
}
