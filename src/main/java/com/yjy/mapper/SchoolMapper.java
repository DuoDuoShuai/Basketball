package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.School;
import com.yjy.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/31
 * @Description: TODO
 */
@Repository
public interface SchoolMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<School> list(LayUiDto dto);
    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 修改
     * @param school
     * @return
     */
    Integer update(School school);

    /**
     * 删除
     * @param schoolId
     * @return
     */
    Integer delete(String schoolId);

    /**
     * 增加
     * @param school
     * @return
     */
    Integer insert(School school);

    /**
     * 接口-查询全部校区
     * @return
     */
    List<School> listAll();

    /**
     * 接口-根据id查获取单个对象
     * @param schoolName
     * @return
     */
    School loadByName(String schoolName);
}
