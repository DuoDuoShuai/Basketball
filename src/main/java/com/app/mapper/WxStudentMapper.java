package com.app.mapper;

import com.yjy.model.GradeStudent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@Repository
public interface WxStudentMapper {

    List<GradeStudent> listById();
}
