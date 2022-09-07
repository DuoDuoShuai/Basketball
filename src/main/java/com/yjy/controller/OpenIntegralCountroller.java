package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.OpenIntegral;
import com.yjy.service.impl.OpenIntegralServiceImpl;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author 任凭
 * @create 2022/9/6 01:49
 * @describe TODO
 */

@RestController
@RequestMapping("OpenIntegral")
public class OpenIntegralCountroller {

    @Autowired
    private OpenIntegralServiceImpl openIntegralService;

    /**
     * 积分渠道全查询列表
     *
     * @param dto
     * @return map
     */
    @RequestMapping("list")
    public JsonPageResult listOpenRotation(LayUiDto dto) {
        JsonPageResult map = openIntegralService.listOpenIntegral(dto);
        return map;
    }

    /**
     * 新增积分渠道
     *
     * @param openIntegral
     * @return 返回添加是否成功参数 success
     */
    @RequestMapping("insert")
    public JsonResult insertOpenIntegral(OpenIntegral openIntegral) {
        Integer insert = openIntegralService.insertOpenIntegral(openIntegral);
        return JsonResult.success(insert);
    }

    /**
     * 批量删除积分渠道
     *
     * @param str
     * @return
     */
    @RequestMapping("deleteMore")
    public JsonResult deleteOpenIntegralMore(String str) {
        Integer deleteMore = openIntegralService.deleteMore(str);
        return JsonResult.success(deleteMore);
    }

    /**
     * 删除单条积分渠道数据
     *
     * @param integralId
     * @return
     */
    @RequestMapping("delete")
    public JsonResult deleteOpenIntegral(String integralId) {
        Integer delete = openIntegralService.deleteOpenIntegral(integralId);
        return JsonResult.success(delete);
    }

    /**
     * 修改积分渠道详细信息
     *
     * @param openIntegral
     * @return
     */
    @RequestMapping("update")
    public JsonResult updateOpenIntegral(OpenIntegral openIntegral) {
        Integer update = openIntegralService.updateOpenIntegral(openIntegral);
        return JsonResult.success(update);
    }
}

