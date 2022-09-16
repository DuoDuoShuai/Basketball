package com.app.service.impl;

import com.app.mapper.WxSchoolMapper;
import com.app.service.WxSchoolService;
import com.yjy.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/14
 * @Description:
 */
@Service
public class WxSchoolServiceImpl implements WxSchoolService {
    @Autowired
    private WxSchoolMapper wxSchoolMapper;

    /**
     * 默认编号为1校区
     * @param
     * @return
     */
    @Override
    public School loadDefault(){
        return wxSchoolMapper.loadDefault();
    }
    /**
     * 根据id查询某个校区-选择校区
     * @param schoolId
     * @return
     */
    @Override
    public School loadById(String schoolId) {
        return wxSchoolMapper.loadById(schoolId);
    }

    /**
     * 查询全部校区信息-校区详情中的校区列表
     * @return
     */
    @Override
    public List<School> listSchool(){
        return wxSchoolMapper.listSchool();
    }
}
