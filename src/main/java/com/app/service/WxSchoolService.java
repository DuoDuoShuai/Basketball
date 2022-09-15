package com.app.service;

import com.yjy.model.School;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/14
 * @Description:
 */
public interface WxSchoolService {

    /**
     * 默认编号为1校区
     * @param
     * @return
     */
    School loadDefault();

    /**
     * 根据id查询某个校区-选择校区
     * @param schoolId
     * @return
     */
    School loadById(String schoolId);

    /**
     * 查询全部校区信息-校区详情中的校区列表
     * @return
     */
    List<School> listSchool();
}
