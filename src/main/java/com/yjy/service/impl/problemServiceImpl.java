package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.ProblemMapper;
import com.yjy.model.Problem;
import com.yjy.service.ProblemService;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 徐晓瑞
 * @date 2022/9/5 16:15
 * @describe:
 */

@Service
public class problemServiceImpl implements ProblemService {

    @Autowired
    private ProblemMapper problemMapper;

    /**
     * 查询全部
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        //判断是否有数据
        Integer count = problemMapper.count(dto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Problem> list = problemMapper.list(dto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }

    /**
     * 添加
     * @param problem
     * @return
     */
    @Override
    public Integer insertProblem(Problem problem) {
        problem.setOpenProblemId(UUID.randomUUID().toString());
        Date currentTime=new Date(System.currentTimeMillis());
        problem.setCreateTime(currentTime.getTime());
        return problemMapper.insertProblem(problem);
    }

    /**
     * 批量删除
     * @param str
     * @return
     */
    @Override
    public Integer deleteProblemMore(String str) {
        String[] split = str.split(",");
        Integer integer = 0;
        for (String s : split) {
            Problem problem = new Problem();
            problem.setOpenProblemId(s);
            Date currentTime = new Date(System.currentTimeMillis());
            problem.setUpdateTime(currentTime.getTime());
            problemMapper.updateTime(problem);
            integer = problemMapper.deleteProblem(problem);
        }
        return integer;
    }

    /**
     * 删除单条
     * @param problemId
     * @return
     */
    @Override
    public Integer deleteProblem(String problemId) {
        Problem problem = new Problem();
        problem.setOpenProblemId(problemId);
        Date currentTime = new Date(System.currentTimeMillis());
        problem.setUpdateTime(currentTime.getTime());
        problemMapper.updateTime(problem);
        return problemMapper.deleteProblem(problem);
    }

    /**
     * 修改
     * @param problem
     * @return
     */
    @Override
    public Integer updateProblem(Problem problem) {
        Date currentTime=new Date(System.currentTimeMillis());
        problem.setUpdateTime(currentTime.getTime());
        return problemMapper.updateProblem(problem);
    }
}
