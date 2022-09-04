package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.School;
import com.yjy.model.Student;
import com.yjy.vo.JsonPageResult;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/31
 * @Description:
 */
public interface SchoolService {
    /**
     * 列表
     * @param dto
     * @return 页面表格数据
     */
    JsonPageResult list(LayUiDto dto);

    /**
     * 详情
     * @param schoolName
     * @return 一个学生对象
     */
    School load(String schoolName);

    /**
     * 修改
     * @param school
     * @return 整数i=1
     */
    Integer update(School school);

    /**
     * 删除
     * @param schoolId
     * @return 整数i=1
     */
    Integer delete(String schoolId);

    /**
     * 批量删除
     * @param schoolIds
     * @return 整数i=1
     */
    Integer deleteMore(String[] schoolIds);

    /**
     * 增加
     * @param school
     * @return 整数i=1
     */
    Integer insert(School school);
}
