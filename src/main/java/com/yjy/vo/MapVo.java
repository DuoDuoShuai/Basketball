package com.yjy.vo;

import java.util.Collections;
import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description:
 */
public class MapVo {
    private static final long serialVersionUID = -5098903228017788445L;
    /**
     * 表格样式-code
     */
    private Integer code;
    /**
     * 表格样式-msg
     */
    private String msg;
    /**
     * 表格样式-分页数据
     */
    private List<?> data;
    /**
     * 表格样式-数据总个数
     */
    private Integer count;

    public static MapVo successPage() {
        MapVo vo = new MapVo();
        vo.setData(Collections.emptyList());
        vo.setCount(0);
        return vo;
    }

    public static MapVo successPage(List<?> list, Integer totalCount) {
        MapVo map = new MapVo();
        map.setCode(0);
        map.setMsg("");
        map.setCount(totalCount);
        map.setData(list);
        return map;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
