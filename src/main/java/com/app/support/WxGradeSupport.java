package com.app.support;

import com.app.mapper.WxGradeMapper;
import com.yjy.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@Component
public class WxGradeSupport {
    @Autowired
    private WxGradeMapper wxGradeMapper;

    /**
     * 接口-新增班级学员关系时，该班级的班级详情中的班级总人数加一
     * @param gradeId
     */
    public void totalCount(String gradeId) {
        Grade grade = wxGradeMapper.load(gradeId);
        Integer totalCount = grade.getTotalCount();
        grade.setTotalCount(totalCount++);
    }
}
