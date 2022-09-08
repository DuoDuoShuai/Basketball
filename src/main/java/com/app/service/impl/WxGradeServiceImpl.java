package com.app.service.impl;

import com.app.dto.WxAllDto;
import com.app.mapper.WxGradeMapper;
import com.app.service.WxGradeService;
import com.yjy.model.Grade;
import com.yjy.util.QiniuFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/6
 * @Description:
 */
@Service
public class WxGradeServiceImpl implements WxGradeService {
    @Autowired
    private WxGradeMapper wxGradeMapper;
    /**
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());

    /**
     * 根据校区名称查询该校区下所有的班级信息
     * @param dto
     * @return
     */
    @Override
    public List<Grade> listAll(WxAllDto dto) {
        return wxGradeMapper.listAll(dto);
    }

    /**
     * 固定校区名称添加新班级
     * @param grade 新建班级对象
     * @return
     */
    @Override
    public Integer insertGrade(Grade grade) {
        grade.setGradeId(UUID.randomUUID().toString());
        grade.setCreateTime(currentTime.getTime());
        grade.setUpdateTime(currentTime.getTime());
        Integer insert = wxGradeMapper.insertGrade(grade);
        return insert;
    }

    /**
     * 根据班级id查询单个班级信息
     * @param gradeId
     * @return
     */
    @Override
    public Grade loadById(String gradeId) {
        return wxGradeMapper.loadById(gradeId);
    }

    /**
     * 编辑班级详情
     * @param grade
     * @return
     */
    @Override
    public Integer updateInfo(Grade grade) {
        grade.setUpdateTime(currentTime.getTime());
        return wxGradeMapper.updateInfo(grade);
    }

}
