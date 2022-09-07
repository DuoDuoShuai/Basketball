package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.model.Grade;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/6
 * @Description:
 */
public interface WxGradeService {
    /**
     * 根据校区名称查询该校区下所有的班级
     * @param dto
     * @return
     */
    List<Grade> listAll(WxAllDto dto);

    /**
     * 固定校区名称添加新班级
     * @param grade
     * @return
     */
    Integer insertGrade(Grade grade);

}
