package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Grade;
import com.yjy.model.Student;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
public interface GradeService {
    /**
     * 列表+检索
     * @param dto
     * @return
     */
    JsonPageResult list(LayUiDto dto);
    /**
     * 详情
     * @param gradeId
     * @return 一个学生对象
     */
    Grade load(String gradeId);

    /**
     * 修改
     * @param grade
     * @param img
     * @return 整数i=1
     */
    Integer update(Grade grade, MultipartFile img);

    /**
     * 删除
     * @param gradeId
     * @return 整数i=1
     */
    Integer delete(String gradeId);
    /**
     * 批量删除
     * @param gradeIds
     * @return 整数i=1
     */
    Integer deleteMore(String[] gradeIds);

    /**
     * 增加
     * @param grade
     * @param img
     * @return 整数i=1
     */
    Integer insert(Grade grade, MultipartFile img);
}
