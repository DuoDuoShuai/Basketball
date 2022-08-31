package com.yjy.controller;

import com.yjy.service.impl.SchoolServiceImpl;
import com.yjy.support.SchoolSupport;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/31
 * @Description:
 */
@Controller
@RequestMapping("school")
public class SchoolController {
    @Autowired
    private SchoolServiceImpl schoolService;
    @Autowired
    private SchoolSupport schoolSupport;
    @RequestMapping("listAll")
    @ResponseBody
    public JsonResult listAll(){
        return JsonResult.success(schoolSupport.listAll());
    }
}
