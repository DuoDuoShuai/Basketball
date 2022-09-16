package com.app.mapper;

import com.yjy.model.Parent;
import com.yjy.model.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @author 徐晓瑞
 * @date 2022/9/14 11:29
 * @describe:
 */

@Repository
public interface WxParentMapper {

    /**
     * 根据家长姓名查询家长基本信息
     * @param name
     * @return
     */
    Parent loadParent(String name);

    /**
     * 家长修改基本信息
     * @param parent
     * @return
     */
    Integer updateParentById(Parent parent);
}
