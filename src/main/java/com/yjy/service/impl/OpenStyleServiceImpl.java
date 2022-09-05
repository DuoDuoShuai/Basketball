package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenStyleMapper;
import com.yjy.model.OpenStyle;
import com.yjy.service.OpenStyleService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/8/30 15:39
 * @describe TODO
 */
@Service
public class OpenStyleServiceImpl implements OpenStyleService {

    @Autowired
    private OpenStyleMapper openStyleMapper;

    @Override
    public JsonPageResult listOpenStyle(LayUiDto dto) {
        Integer count = openStyleMapper.count(dto);
        if(count == 0){
            return JsonPageResult.successPage();
        }
        List<OpenStyle> list = openStyleMapper.listOpenStyle(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list,count);
        return mapVo;
    }
}
