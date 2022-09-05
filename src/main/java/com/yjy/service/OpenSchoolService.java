package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.dto.OpenDto;
import com.yjy.model.OpenSchool;
import com.yjy.model.School;
import com.yjy.vo.JsonPageResult;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/4
 * @Description:
 */
public interface OpenSchoolService {
    /**
     * 列表
     * @param dto
     * @return 页面表格数据
     */
    JsonPageResult list(OpenDto dto);

    /**
     * 修改
     * @param openSchool
     * @return 整数i=1
     */
    Integer update(OpenSchool openSchool);

    /**
     * 删除
     * @param openSchoolId
     * @return 整数i=1
     */
    Integer delete(String openSchoolId);

    /**
     * 批量删除
     * @param openSchoolIds
     * @return 整数i=1
     */
    Integer deleteMore(String[] openSchoolIds);

    /**
     * 增加
     * @param openSchool
     * @return 整数i=1
     */
    Integer insert(OpenSchool openSchool);
}
