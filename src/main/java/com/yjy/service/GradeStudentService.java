package com.yjy.service;

import com.yjy.dto.RelationDto;
import com.yjy.model.Grade;
import com.yjy.model.GradeStudent;
import com.yjy.vo.JsonPageResult;


/**
 * @Author:黄文倩
 * @CreatTime:2022/9/3
 * @Description:
 */
public interface GradeStudentService {
    /**
     * 列表+检索
     * @param dto
     * @return
     */
    JsonPageResult list(RelationDto dto);

    /**
     * 详情
     * @param id
     * @return
     */
    GradeStudent load(String id);

    /**
     * 修改
     * @param gradeStudent
     * @return
     */
    Integer update(GradeStudent gradeStudent);

    /**
     * 新增
     * @param gradeStudent
     * @return
     */
    Integer insert(GradeStudent gradeStudent);
}
