package com.app.support;

import com.app.dto.WxAllDto;
import com.app.dto.WxInsertDto;
import com.app.mapper.WxStudentMapper;
import com.yjy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/7
 * @Description:
 */
@Component
public class WxStudentSupport {
    @Autowired
    private WxStudentMapper wxStudentMapper;

    /**
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());

    /**
     * 接口-根据id查出对应学员信息-给班级模块查看班级学员信息
     * @param studentId
     * @return
     */
    public Student loadById(String studentId){
        return wxStudentMapper.loadById(studentId);
    }

    /**
     * 接口-查询全部学员信息
     * @return
     */
    public List<Student> listAll(){
        return null;
    }

    /**
     * 根据班级id查询班级下的所有学员
     * @param wxAllDto
     * @return
     */
    public List<Student> listStudent(WxAllDto wxAllDto){
        return wxStudentMapper.listStudent(wxAllDto);
    }

    /**
     * 查询校区下所有学员信息-报名支付选择学员
     * @param wxAllDto
     * @return
     */
    public List<Student> listByEnroll(WxAllDto wxAllDto){
        return wxStudentMapper.listByEnroll(wxAllDto);
    }

    /**
     * 添加新学员--报名时添加未有的学员
     * @param wxInsertDto
     * @return
     */
    public Integer insertByEnroll(WxInsertDto wxInsertDto){
        wxInsertDto.setStudentId(UUID.randomUUID().toString());
        wxInsertDto.setCreateTime(currentTime.getTime());
        wxInsertDto.setUpdateTime(currentTime.getTime());
        return wxStudentMapper.insertStudent(wxInsertDto);
    }
}
