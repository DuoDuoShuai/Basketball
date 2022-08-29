package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Student;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description:
 */
public interface StudentMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<Student> list(LayUiDto dto);
    /**
     * 列表总数
     */
    Integer count(LayUiDto dto);
    /**
     * 详情--根据id查
     */
    Student info(Integer userid);
    /**
     * 修改
     */
    Integer update(Student student);
    /**
     * 删除
     */
    Integer remove(Integer studentId);
    /**
     * 增加
     */
    Integer add(Student student);
}
