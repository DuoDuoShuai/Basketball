package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.TeacherMapper;
import com.yjy.model.Admin;
import com.yjy.service.TeacherService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:27
 * @describe: TODO-
 */

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public JsonPageResult list(LayUiDto dto) {
        //判断是否有数据
        Integer count = teacherMapper.count(dto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Admin> list = teacherMapper.list(dto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }
}
