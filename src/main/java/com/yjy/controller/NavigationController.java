package com.yjy.controller;

import com.yjy.dto.OpenDto;
import com.yjy.model.Navigation;
import com.yjy.model.OpenSchool;
import com.yjy.service.OpenSchoolService;
import com.yjy.service.impl.NavigationServiceImpl;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/5
 * @Description:
 */
@Controller
@RequestMapping("navigation")
public class NavigationController {
    @Autowired
    private NavigationServiceImpl navigationService;

    /**
     * 列表
     * @param dto
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public JsonPageResult list(OpenDto dto){
        return navigationService.list(dto);
    }

    /**
     * 批量删除
     * @param openNavigationIds
     * @return
     */
    @RequestMapping("deleteMore")
    @ResponseBody
    public JsonResult deleteMore(@RequestParam("openNavigationIds[]") String[] openNavigationIds){
        return JsonResult.success(navigationService.deleteMore(openNavigationIds));
    }

    /**
     * 删除
     * @param openNavigationId
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
    public JsonResult delete(String openNavigationId){
        return JsonResult.success(navigationService.delete(openNavigationId));
    }

    /**
     * 新增校区
     * @param navigation
     * @return
     */
    @RequestMapping("insert")
    @ResponseBody
    public JsonResult insert(Navigation navigation){
        return JsonResult.success(navigationService.insert(navigation));
    }

    /**
     * 修改
     * @param navigation
     * @return
     */
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(Navigation navigation){
        return JsonResult.success(navigationService.update(navigation));
    }

}
