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
    Integer delete(String studentId);

    /**
     * 删除时修改时间
     * @param student
     * @return
     */
    Integer updateTime(Student student);

    /**
     * 增加
     * @param student
     * @return
     */
    Integer insert(Student student);

    /**
     * 接口-查询全部学员
     * @return
     */
    List<Student> listAll();

    /**
     * 接口-根据id查获取单个对象
     * @param studentId
     * @return
     */
    Student loadById(String studentId);
}
