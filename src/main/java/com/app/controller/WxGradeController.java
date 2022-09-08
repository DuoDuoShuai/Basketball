package com.app.controller;

import com.app.dto.WxAllDto;
import com.app.service.impl.WxGradeServiceImpl;
import com.app.vo.WxJsonResult;
import com.yjy.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@RestController
@RequestMapping("wx_grade")
public class WxGradeController {
    @Autowired
    private WxGradeServiceImpl wxGradeService;

    /**
     * 根据校区名称查询该校区下所有的班级信息
     * @param dto
     * @return
     */
    @RequestMapping("listAll")
    public WxJsonResult listAll(WxAllDto dto){
        return WxJsonResult.success(wxGradeService.listAll(dto));
    }

    /**
     * 固定校区名称添加新班级
     * @param grade
     * @return
     */
    @RequestMapping("insertGrade")
    public WxJsonResult insertGrade(Grade grade){
        return WxJsonResult.success(wxGradeService.insertGrade(grade));
    }
}
