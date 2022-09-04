package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.dto.RelationDto;
import com.yjy.model.GradeStudent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/3
 * @Description:
 */
@Repository
public interface GradeStudentMapper {
    /**
     * 详情+检索
     * @param dto
     * @return
     */
    List<GradeStudent> list(RelationDto dto);

    /**
     * 总数
     * @param dto
     * @return
     */
    Integer count(RelationDto dto);

    /**
     * 详情
     * @param id
     * @return
     */
    GradeStudent load(String id);

    /**
     * 新增
     * @param gradeStudent
     * @return
     */
    Integer insert(GradeStudent gradeStudent);

    /**
     * 修改
     * @param gradeStudent
     * @return
     */
    Integer update(GradeStudent gradeStudent);
}
