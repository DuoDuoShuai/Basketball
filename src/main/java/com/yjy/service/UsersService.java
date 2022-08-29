package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Users;
import com.yjy.vo.MapVo;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:
 */
public interface UsersService {
    /**
     * 列表
     */
    MapVo list(LayUiDto dto);
//     Map<String,Object> list(LayUiDto dto);
    /**
     * 详情
     */
    Users info(Integer userid);
    /**
     * 详情s
     */
    Users infos(Integer[] userid);
    /**
     * 修改
     */
    Integer update(Users users);
    /**
     * 删除
     */
    Integer remove(Integer userid);
    /**
     * 批量删除
     */
    Integer removeMore(Integer[] userids);
}
