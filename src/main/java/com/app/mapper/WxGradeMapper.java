package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.model.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/6
 * @Description:
 */
@Repository
public interface WxGradeMapper {
    /**
     * 根据校区名称查询该校区下所有的班级信息
     * @param dto
     * @return
     */
    List<Grade> listAll(WxAllDto dto);

    /**
     * 固定校区名称添加新班级
     * @param grade
     * @return
     */
    Integer insertGrade(Grade grade);

    /**
     * 查询单个班级
     * @param gradeId
     * @return
     */
    Grade load(String gradeId);
}
