package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.dto.OpenDto;
import com.yjy.model.OpenSchool;
import com.yjy.model.School;
import com.yjy.service.OpenSchoolService;
import com.yjy.service.impl.SchoolServiceImpl;
import com.yjy.support.SchoolSupport;
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
public class OpenSchoolController {
    @Autowired
    private OpenSchoolService openSchoolService;

    /**
     * 列表
     * @param dto
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(OpenDto dto){
        return openSchoolService.list(dto);
    }

    /**
     * 批量删除
     * @param openSchoolIds
     * @return
     */
    @RequestMapping("deleteMore")
    @ResponseBody
    public JsonResult deleteMore(@RequestParam("openSchoolIds[]") String[] openSchoolIds){
        return JsonResult.success(openSchoolService.deleteMore(openSchoolIds));
    }

    /**
     * 删除
     * @param openSchoolId
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
    public JsonResult delete(String openSchoolId){
        return JsonResult.success(openSchoolService.delete(openSchoolId));
    }

    /**
     * 新增校区
     * @param openSchool
     * @return
     */
    @RequestMapping("insert")
    @ResponseBody
    public JsonResult insert(OpenSchool openSchool){
        return JsonResult.success(openSchoolService.insert(openSchool));
    }

    /**
     * 修改
     * @param openSchool
     * @return
     */
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(OpenSchool openSchool){
        return JsonResult.success(openSchoolService.update(openSchool));
    }

}
