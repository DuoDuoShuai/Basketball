package com.app.mapper;

import com.yjy.model.Hour;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-08 11:17:37
 * @describe: TODO
 */
@Repository
public interface WxHourMapper {
    /**
     * 销课查询
     * @param hour
     * @return
     */
    public List<Hour> listHour(Hour hour);

    /**
     * 接口--根据id查销课记录
     * @param hourId
     * @return
     */

    public Hour loadHourById(String hourId);
}
