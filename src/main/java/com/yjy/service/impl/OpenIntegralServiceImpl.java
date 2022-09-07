package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenIntegralMapper;
import com.yjy.model.OpenIntegral;
import com.yjy.service.OpenIntegralService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 任凭
 * @create 2022/9/6 01:25
 * @describe TODO
 */

@Service
public class OpenIntegralServiceImpl implements OpenIntegralService {

    @Autowired
    private OpenIntegralMapper openIntegralMapper;

    /**
     * 列表
     *
     * @param dto
     * @return 返回mapvo页面表格数据
     */
    @Override
    public JsonPageResult listOpenIntegral(LayUiDto dto) {
        Integer count = openIntegralMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenIntegral> list = openIntegralMapper.listOpenIntegral(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     *
     * @param integralId
     * @return OpenIntegral
     */
    @Override
    public OpenIntegral loadOpenIntegral(String integralId) {
        OpenIntegral openIntegral = openIntegralMapper.loadOpenIntegral(integralId);
        return openIntegral;
    }

    /**
     * 增加
     *
     * @param openIntegral
     * @return 整数num=1
     */
    @Override
    public Integer insertOpenIntegral(OpenIntegral openIntegral) {
        openIntegral.setIntegralId(UUID.randomUUID().toString());
        Date currentTime = new Date(System.currentTimeMillis());
        openIntegral.setCreateTime(currentTime.getTime());
        openIntegral.setUpdateTime(currentTime.getTime());
        return openIntegralMapper.insertOpenIntegral(openIntegral);
    }

    /**
     * 删除
     *
     * @param integralId
     * @return 整数delete=1
     */
    @Override
    public Integer deleteOpenIntegral(String integralId) {
        OpenIntegral openIntegral = new OpenIntegral();
        openIntegral.setIntegralId(integralId);
        Date currentTime = new Date(System.currentTimeMillis());
        openIntegral.setUpdateTime(currentTime.getTime());
        openIntegralMapper.updateTime(openIntegral);
        return openIntegralMapper.deleteOpenIntegral(openIntegral);
    }

    /**
     * 批量删除
     *
     * @param openIntegralIds
     * @return 返回多个对象delete参数
     */
    @Override
    public Integer deleteMore(String openIntegralIds) {
        String[] split = openIntegralIds.split(",");
        Integer integer = 0;
        for (String s : split) {
            OpenIntegral openIntegral = new OpenIntegral();
            openIntegral.setIntegralId(s);
            Date currentTime = new Date(System.currentTimeMillis());
            openIntegral.setUpdateTime(currentTime.getTime());
            openIntegralMapper.updateTime(openIntegral);
            integer = openIntegralMapper.deleteOpenIntegral(openIntegral);
        }
        return integer;
    }

    /**
     * 修改
     *
     * @param openIntegral
     * @return 整数update=1
     */
    @Override
    public Integer updateOpenIntegral(OpenIntegral openIntegral) {
        Date currentTime = new Date(System.currentTimeMillis());
        openIntegral.setUpdateTime(currentTime.getTime());
        return openIntegralMapper.updateOpenIntegral(openIntegral);
    }
}
