package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.GradeMapper;
import com.yjy.model.Grade;
import com.yjy.service.GradeService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;

    /**
     * 查询+检索
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        Integer count = gradeMapper.count(dto);
        if(count==0){
            JsonPageResult.successPage();
        }
        List<Grade> list = gradeMapper.list(dto);
        return JsonPageResult.successPage(list,count);
    }
}
