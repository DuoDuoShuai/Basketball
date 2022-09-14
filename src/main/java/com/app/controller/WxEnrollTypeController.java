package com.app.controller;

import com.app.service.WxEnrollTypeService;
import com.app.vo.WxJsonResult;
import com.yjy.model.EnrollType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐晓瑞
 * @date 2022/9/13 17:18
 * @describe:
 */

@RestController
@RequestMapping("enrollType")
public class WxEnrollTypeController {

    @Autowired
    private WxEnrollTypeService wxEnrollTypeService;

    @RequestMapping("insertEnrollType")
    public WxJsonResult insertEnrollType(EnrollType enrollType){
        return WxJsonResult.success(wxEnrollTypeService.insertEnrollType(enrollType));
    }
}
