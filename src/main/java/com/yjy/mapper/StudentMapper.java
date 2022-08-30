package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description:
 */
@Repository
public interface StudentMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<Student> list(LayUiDto dto);
    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 获取单个对象--根据id查
     * @param studentId
     * @return
     */
    Student load(String studentId);

    /**
     * 修改
     * @param student
     * @return
     */
    Integer update(Student student);

    /**
     * 删除
     * @param studentId
     * @return
     */
    Integer remove(String studentId);

    /**
     * 增加
     * @param student
     * @return
     */
    Integer insert(Student student);
}
