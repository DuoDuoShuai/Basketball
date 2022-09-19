package com.app.service;

import com.app.dto.WxAllDto;
import com.yjy.dto.OpenDto;
import com.yjy.model.Navigation;
import com.yjy.vo.JsonPageResult;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
public interface WxOpenNavigationService {
    /**
     * 列表
     * @param wxAllDto
     * @return 页面表格数据
     */
    JsonPageResult list(WxAllDto wxAllDto);

}
