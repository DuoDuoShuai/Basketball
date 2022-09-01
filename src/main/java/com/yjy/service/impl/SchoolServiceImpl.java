package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.SchoolMapper;
import com.yjy.model.School;
import com.yjy.model.Student;
import com.yjy.service.SchoolService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/31
 * @Description:
 */
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;
    @Override
    public JsonPageResult list(LayUiDto dto) {
        Integer count = schoolMapper.count(dto);
        if(count==0){
            return JsonPageResult.successPage();
        }
        List<School> list = schoolMapper.list(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    @Override
    public School load(String schoolId) {
        return null;
    }

    @Override
    public Integer update(School school) {
        return null;
    }

    @Override
    public Integer delete(String schoolId) {
        return null;
    }

    @Override
    public Integer deleteMore(String[] schoolIds) {
        return null;
    }

    @Override
    public Integer insert(School school) {
        return null;
    }
}
