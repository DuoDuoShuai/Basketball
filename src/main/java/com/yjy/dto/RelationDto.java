package com.yjy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/3
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelationDto {
    private static final long serialVersionUID = 5172649115384573373L;
    /**
     * 0
     */
    private static final Integer ZERO = 0;
    /**
     * 每页显示条数
     */
    private Integer page;
    /**
     * 页码
     */
    private Integer limit;
    /**
     * sql分页起始位置
     */
    private Integer dataNum = ZERO;
    /**
     * 排序 desc降序 asc升序
     */
    private String sort;
    /**
     * 状态
     */
    private Boolean state;
    /**
     * id
     */
    private String id;
    /**
     * 主表id
     */
    private String mainId;
    /**
     * 其他表id
     */
    private String otherId;
    /**
     * @param page 页码
     * @param limit 每页显示数
     */
    public RelationDto(Integer page, Integer limit) {
        if (page != null && page > ZERO) {
            this.page = page;
        }
        if (limit != null && limit > ZERO) {
            this.limit = limit;
        }
        this.dataNum = (this.page - 1) * this.limit;
    }
}
