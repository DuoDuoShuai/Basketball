package com.app.support;

import com.app.mapper.WxTeacherMapper;
import com.yjy.model.Teacher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 徐晓瑞
 * @date 2022/9/7 11:31
 * @describe:
 */
@Component
public class WxTeacherSupport {

    @Resource
    private WxTeacherMapper wxTeacherMapper;

    /**
     * 接口-查询全部教练名称
     * @return
     */
    public List<Teacher> listTeacherName(){
        return wxTeacherMapper.listTeacherName();
    }
}
