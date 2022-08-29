package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:users表的mapper
 */
@Repository
public interface UsersMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<Users> list(LayUiDto dto);

    /**
     * 列表总数
     */
    Integer count(LayUiDto dto);
    /**
     * 详情--根据id查
     */
    Users info(Integer userid);
    /**
     * 修改
     */
    Integer update(Users users);
    /**
     * 删除
     */
    Integer remove(Integer userid);
}
