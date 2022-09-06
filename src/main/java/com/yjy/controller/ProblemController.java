package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Problem;
import com.yjy.service.ProblemService;
import com.yjy.vo.JsonPageResult;
import com.yjy.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 23:24
 * @describe:
 */

@RestController
@RequestMapping("problem")
public class ProblemController {

    @Autowired
    private ProblemService problemService;

    /**
     * 问题信息展示
     * @param dto
     * @return
     */
    @RequestMapping("list")
    public JsonPageResult list(LayUiDto dto){
        JsonPageResult map = problemService.list(dto);
        return map;
    }

    /**
     * 添加
     * @param problem
     * @return
     */
    @RequestMapping("insertProblem")
    public JsonResult insertParent(Problem problem){
        Integer integer = problemService.insertProblem(problem);
        return JsonResult.success(integer);
    }

    /**
     * 批量删除
     * @param str
     * @return
     */
    @RequestMapping("deleteProblemMore")
    public JsonResult deleteParentMore(String str){
        Integer integer = problemService.deleteProblemMore(str);
        return JsonResult.success(integer);
    }

    /**
     * 删除单条
     * @param problemId
     * @return
     */
    @RequestMapping("deleteProblem")
    public JsonResult deleteParent(String problemId){
        Integer integer = problemService.deleteProblem(problemId);
        return JsonResult.success(integer);
    }

    /**
     * 修改
     * @param problem
     * @return
     */
    @RequestMapping("updateProblem")
    public JsonResult deleteParent(Problem problem){
        Integer integer = problemService.updateProblem(problem);
        return JsonResult.success(integer);
    }
}
