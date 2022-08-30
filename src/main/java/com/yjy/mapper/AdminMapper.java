package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 17:14
 * @describe: TODO-
 */
@Repository
public interface AdminMapper {
    /**
     * 管理员信息查询全部
     * @param dto
     * @return
     */
    List<Admin> list(LayUiDto dto);

    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);
}
