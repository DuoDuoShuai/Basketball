package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Student;
import com.yjy.vo.JsonPageResult;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description:
 */
public interface StudentService {
    /**
     * 列表
     * @param dto
     * @return 页面表格数据
     */
    JsonPageResult list(LayUiDto dto);

    /**
     * 详情
     * @param studentId
     * @return 一个学生对象
     */
    Student load(String studentId);

    /**
     * 修改
     * @param student
     * @return 整数i=1
     */
    Integer update(Student student);

    /**
     * 删除
     * @param studentId
     * @return 整数i=1
     */
    Integer remove(String studentId);

    /**
     * 批量删除
     * @param studentIds
     * @return 整数i=1
     */
    Integer removeMore(String[] studentIds);

    /**
     * 增加
     * @param student
     * @return 整数i=1
     */
    Integer insert(Student student);
}
