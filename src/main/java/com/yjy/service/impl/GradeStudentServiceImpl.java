package com.yjy.service.impl;

import com.yjy.dto.RelationDto;
import com.yjy.mapper.GradeStudentMapper;
import com.yjy.model.GradeStudent;
import com.yjy.service.GradeStudentService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/3
 * @Description:
 */
@Service
public class GradeStudentServiceImpl implements GradeStudentService {
    @Autowired
    private GradeStudentMapper gradeStudentMapper;
    /**
     * 列表+检索
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(RelationDto dto) {
        Integer count = gradeStudentMapper.count(dto);
        if(count==0){
           return JsonPageResult.successPage();
        }
        List<GradeStudent> list = gradeStudentMapper.list(dto);
        return JsonPageResult.successPage(list,count);
    }

    /**
     * 详情
     * @param id
     * @return
     */
    @Override
    public GradeStudent load(String id) {
        return gradeStudentMapper.load(id);
    }

    /**
     *
     * @param gradeStudent
     * @return
     */
    @Override
    public Integer update(GradeStudent gradeStudent) {
        return gradeStudentMapper.update(gradeStudent);
    }

    /**
     *
     * @param gradeStudent
     * @return
     */
    @Override
    public Integer insert(GradeStudent gradeStudent) {
        gradeStudent.setId(UUID.randomUUID().toString());
        return gradeStudentMapper.insert(gradeStudent);
    }
}
