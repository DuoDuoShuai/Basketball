package com.yjy.mapper;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Admin;
import com.yjy.model.Ansewr;
import com.yjy.model.Parent;

import java.util.List;

/**
 * @author 徐晓瑞
 * @create 2022/9/5 15:34
 * @describe
 */
public interface AnsewrMapper {
    /**
     * 查询全部回答
     * @param dto
     * @return
     */
    List<Ansewr> list(LayUiDto dto);

    /**
     * 列表总数
     * @param dto
     * @return
     */
    Integer count(LayUiDto dto);

    /**
     * 添加回答
     * @param ansewr
     * @return
     */
    Integer insertAnsewr(Ansewr ansewr);

    /**
     * 删除回答
     * @param ansewr
     * @return
     */
    Integer deleteAnsewr(Ansewr ansewr);

    /**
     * 修改回答信息
     * @param ansewr
     * @return
     */
    Integer updateAnsewr(Ansewr ansewr);

    /**
     * 删除时改变修改时间
     * @param ansewr
     * @return
     */
    Integer updateTime(Ansewr ansewr);
}
