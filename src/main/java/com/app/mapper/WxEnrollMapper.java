package com.app.mapper;

import com.app.dto.WxAllDto;
import com.yjy.model.Enroll;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/9
 * @Description:
 */
@Repository
public interface WxEnrollMapper {

    /**
     * 接口--查询学员不在班级学员表中的报名记录
     * @param wxAllDto
     * @return
     */
    List<Enroll> listByGrade(WxAllDto wxAllDto);
}
