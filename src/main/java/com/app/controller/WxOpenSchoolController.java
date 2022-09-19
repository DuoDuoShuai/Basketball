package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.WxOpenSchoolService;
import com.yjy.dto.OpenDto;
import com.yjy.model.OpenSchool;
import com.yjy.service.OpenSchoolService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/4
 * @Description:
 */
@Controller
@RequestMapping("openSchool")
public class WxOpenSchoolController {
    @Autowired
    private WxOpenSchoolService wxOpenSchoolService;

    /**
     * 列表
     * @param wxAllDto
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(WxAllDto wxAllDto){
        return wxOpenSchoolService.list(wxAllDto);
    }

}
