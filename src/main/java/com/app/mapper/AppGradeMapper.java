package com.app.mapper;

import com.app.dto.CountDto;
import com.app.model.AppGrade;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/6
 * @Description:
 */
@Repository
public interface AppGradeMapper {
    /**
     * 根据校区名称查询该校区下所有的班级
     * @param dto
     * @return
     */
    List<AppGrade> listAll(CountDto dto);

    /**
     * 根据校区名称和班级编号查询该班级总人数
     * @param dto
     * @return
     */
    Integer count(CountDto dto);
    /**
     * 根据校区名称添加新班级
     * @param grade
     * @return
     */
    Integer insertGrade(AppGrade grade);
}
