package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.service.impl.SchoolServiceImpl;
import com.yjy.support.SchoolSupport;
import com.yjy.vo.JsonPageResult;
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

    /**
     * 列表
     * @param dto
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(LayUiDto dto){
        return schoolService.list(dto);
    }

    /**
     * 接口-查询全部校区
     * @return
     */
    @RequestMapping("listAll")
    @ResponseBody
    public JsonResult listAll(){
        return JsonResult.success(schoolSupport.listAll());
    }

    /**
     * 接口-根据校区名称拆查询单个校区
     * @param schoolName
     * @return
     */
    @RequestMapping("loadByName")
    @ResponseBody
    public JsonResult loadByName(String schoolName){
        return JsonResult.success(schoolSupport.loadByName(schoolName));
    }

}
