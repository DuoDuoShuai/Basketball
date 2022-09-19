package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.dto.OpenDto;
import com.yjy.model.OpenSchool;
import com.yjy.vo.JsonPageResult;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/4
 * @Description:
 */
public interface WxOpenSchoolService {
    /**
     * 列表
     * @param wxAllDto
     * @return 页面表格数据
     */
    JsonPageResult list(WxAllDto wxAllDto);

}
