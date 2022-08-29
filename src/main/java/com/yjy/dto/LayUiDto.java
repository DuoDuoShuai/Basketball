package com.yjy.dto;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description:
 */
public class LayUiDto {
    private static final long serialVersionUID = 5172649115384573373L;
    /**
     * 0
     */
    private static final Integer ZERO = 0;
    /**
     * 每页显示条数
     */
    private Integer page ;
    /**
     * 页码
     */
    private Integer limit ;
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
    private Integer state;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户电话
     */
    private String phone;
    /**
     * @param page 页码
     * @param limit 每页显示数
     */
    public LayUiDto(Integer page, Integer limit) {
        if (page != null && page > ZERO) {
            this.page = page;
        }
        if (limit != null && limit > ZERO) {
            this.limit = limit;
        }
        this.dataNum = (this.page - 1) * this.limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getDataNum() {
        return dataNum;
    }

    public void setDataNum(Integer dataNum) {
        this.dataNum = dataNum;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
