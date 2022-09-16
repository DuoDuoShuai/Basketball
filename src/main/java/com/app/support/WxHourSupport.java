package com.app.support;

import com.app.mapper.WxHourMapper;
import com.yjy.model.Hour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-09 10:14:12
 * @describe: 
 */
@Component
public class WxHourSupport {
    @Autowired
    private WxHourMapper wxHourMapper;

    /**
     * 接口--根据id查销课相关的信息--学员模块和班级模块
     * @param hourId
     * @return
     */

    public Hour loadHourById(String hourId){
        return wxHourMapper.loadHourById(hourId);
    }
}
