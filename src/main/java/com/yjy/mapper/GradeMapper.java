package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Grade;
import com.yjy.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
@Repository
public interface GradeMapper {
    /**
     * 列表+检索
     * @param dto
     * @return
     */
    List<Grade> list(LayUiDto dto);

    /**
     * 总条数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 修改
     * @param grade
     * @return
     */
    Integer update(Grade grade);

    /**
     * 删除
     * @param gradeId
     * @return
     */
    Integer delete(String gradeId);

    /**
     * 删除时修改时间
     * @param grade
     * @return
     */
    Integer updateTime(Grade grade);

    /**
     * 增加
     * @param grade
     * @return
     */
    Integer insert(Grade grade);

    /**
     * 查询单个
     * @param gradeId
     * @return
     */
    Grade load(String gradeId);
}
