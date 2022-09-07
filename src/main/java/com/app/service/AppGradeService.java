package com.app.service;

import com.app.dto.CountDto;
import com.app.model.AppGrade;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/6
 * @Description:
 */
public interface AppGradeService {
    /**
     * 根据校区名称查询该校区下所有的班级
     * @param dto
     * @return
     */
    List<AppGrade> listAll(CountDto dto);


    /**
     * 根据校区名称添加新班级+计算班级总人数
     * @param grade
     * @return
     */
    Integer insertGrade(AppGrade grade);
}
