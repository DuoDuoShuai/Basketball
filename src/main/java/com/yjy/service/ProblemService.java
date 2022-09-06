package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Parent;
import com.yjy.model.Problem;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 徐晓瑞
 * @create 2022/9/5 16:14
 * @describe
 */
public interface ProblemService {
    /**
     * 问题信息展示
     * @param dto
     * @return
     */
    JsonPageResult list(LayUiDto dto);

    /**
     * 添加
     * @param problem
     * @return
     */
    Integer insertProblem(Problem problem);

    /**
     * 批量删除问题
     * @param str
     * @return
     */
    Integer deleteProblemMore(String str);

    /**
     * 删除问题
     * @param problemId
     * @return
     */
    Integer deleteProblem(String problemId);

    /**
     * 修改
     * @param problem
     * @return
     */
    Integer updateProblem(Problem problem);
}
