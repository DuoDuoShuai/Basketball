package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.HourMapper;
import com.yjy.model.Course;
import com.yjy.model.Hour;
import com.yjy.service.HourService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-01 14:56:57
 * @describe: TODO
 */
@Service
public class HourServiceImpl implements HourService {
    @Autowired
    private HourMapper hourMapper;

    /**
     * 查询销课
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult listHour(LayUiDto dto) {
        /*判断是否有数据*/
        int count = hourMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<Hour> hours = hourMapper.listHour(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(hours,count);
        return mapVo;
    }
}
