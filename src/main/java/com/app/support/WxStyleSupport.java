package com.app.support;

import com.app.dto.WxAllDto;
import com.app.dto.WxInsertDto;
import com.app.dto.WxUpdateDto;
import com.app.mapper.WxStudentMapper;
import com.app.mapper.WxStyleMapper;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/15
 * @Description:
 */
@Component
public class WxStyleSupport {
    @Autowired
    private WxStyleMapper wxStyleMapper;

    /**
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());

    /**
     * 接口-修改学员的展示状态
     * @param wxUpdateDto
     * @return
     */
    public Integer updateStyle(WxUpdateDto wxUpdateDto){
        return wxStyleMapper.updateStyle(wxUpdateDto);
    }
}
