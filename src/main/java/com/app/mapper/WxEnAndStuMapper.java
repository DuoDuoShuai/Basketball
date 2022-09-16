package com.app.mapper;

import com.yjy.model.EnrollAndStudent;
import org.springframework.stereotype.Repository;

/**
 * @author 徐晓瑞
 * @create 2022/9/1 10:20
 * @describe
 */

@Repository
public interface WxEnAndStuMapper {

    /**
     *
     * @param enrollAndStudent
     * @return
     */
    Integer insertEnAndStu(EnrollAndStudent enrollAndStudent);
}
