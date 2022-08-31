package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenRotationMapper;
import com.yjy.model.OpenRotation;
import com.yjy.service.OpenRotationService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 任凭
 * @create 2022/8/31 13:06
 * @describe TODO
 */
@Service
public class OpenRotationServiceImpl implements OpenRotationService {

    @Autowired
    private OpenRotationMapper openRotationMapper;

    /**
     * 列表
     *
     * @param dto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listOpenRotation(LayUiDto dto) {
        Integer count = openRotationMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenRotation> list = openRotationMapper.listOpenRotation(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }
}
