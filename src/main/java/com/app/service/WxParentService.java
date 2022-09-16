package com.app.service;

import com.yjy.model.Parent;
import com.yjy.model.Teacher;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 徐晓瑞
 * @date 2022/9/15 9:48
 * @describe:
 */

public interface WxParentService {

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
    Integer updateParentById(Parent parent, MultipartFile img);
}
