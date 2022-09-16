package com.app.controller;

import com.app.service.WxParentService;
import com.app.vo.WxJsonResult;
import com.yjy.model.Parent;
import com.yjy.model.Teacher;
import com.yjy.vo.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author 徐晓瑞
 * @date 2022/9/15 9:54
 * @describe:
 */

@RestController
@RequestMapping("wxParent")
public class WxParentController {

    @Resource
    private WxParentService wxParentService;

    /**
     * 根据家长姓名查询家长基本信息
     * @param name
     * @return
     */
    @RequestMapping("loadParent")
    public WxJsonResult loadTeacher(String name){
        return WxJsonResult.success(wxParentService.loadParent(name));
    }

    /**
     * 家长修改基本信息
     * @param parent
     * @return
     */
    @RequestMapping("updateParent")
    public JsonResult deleteParent(Parent parent, MultipartFile img){
        Integer integer = wxParentService.updateParentById(parent, img);
        return JsonResult.success(integer);
    }
}
