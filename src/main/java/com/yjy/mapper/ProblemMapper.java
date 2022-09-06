package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Admin;
import com.yjy.model.Parent;
import com.yjy.model.Problem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 徐晓瑞
 * @create 2022/9/5 15:34
 * @describe
 */

@Repository
public interface ProblemMapper {
    /**
     * 查询全部问题
     * @param dto
     * @return
     */
    List<Problem> list(LayUiDto dto);

    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 添加问题
     * @param problem
     * @return
     */
    Integer insertProblem(Problem problem);

    /**
     * 删除家问题
     * @param problem
     * @return
     */
    Integer deleteProblem(Problem problem);

    /**
     * 修改问题信息
     * @param problem
     * @return
     */
    Integer updateProblem(Problem problem);

    /**
     * 删除时改变修改时间
     * @param problem
     * @return
     */
    Integer updateTime(Problem problem);
}
