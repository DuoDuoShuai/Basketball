package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Student;
import com.yjy.vo.MapVo;

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
    MapVo list(LayUiDto dto);

    /**
     * 详情
     * @param id
     * @return 一个学生对象
     */
    Student info(Integer id);

    /**
     * 修改
     * @param student
     * @return 整数i=1
     */
    Integer update(Student student);

    /**
     * 删除
     * @param id
     * @return 整数i=1
     */
    Integer remove(Integer id);

    /**
     * 批量删除
     * @param ids
     * @return 整数i=1
     */
    Integer removeMore(Integer[] ids);

    /**
     * 增加
     * @param student
     * @return 整数i=1
     */
    Integer add(Student student);
}
