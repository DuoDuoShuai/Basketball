package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Student;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description: TODO
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
     * @param img
     * @return 整数i=1
     */
    Integer update(Student student,MultipartFile img);

    /**
     * 删除
     * @param studentId
     * @return 整数i=1
     */
    Integer delete(String studentId);
    /**
     * 批量删除
     * @param studentIds
     * @return 整数i=1
     */
    Integer deleteMore(String[] studentIds);

    /**
     * 增加
     * @param student
     * @param img
     * @return 整数i=1
     */
    Integer insert(Student student, MultipartFile img);
}
