package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.OpenCourseMapper;
import com.yjy.model.Course;
import com.yjy.model.OpenCourse;
import com.yjy.service.OpenCourseService;
import com.yjy.util.QiniuFile;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 哆哆
 * @description
 * @date 2022-09-05 17:52:30
 * @describe: TODO
 */
@Service
public class OpenCourseServiceImpl implements OpenCourseService {
    @Autowired
    private OpenCourseMapper openCourseMapper;

    /**
     * 公共信息课程查询
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult listOpenCourse(LayUiDto dto) {
        /*判断是否有数据*/
        int count = openCourseMapper.count(dto);
        if (count == 0) {
            return JsonPageResult.successPage();
        }
        List<OpenCourse> openCourses = openCourseMapper.listOpenCourse(dto);
        JsonPageResult mapVo = JsonPageResult.successPage(openCourses,count);
        return mapVo;
    }

    /**
     * 添加公共信息课程
     * @param opencourse
     * @param img
     * @return
     */
    @Override
    public Integer insertOpenCourse(OpenCourse opencourse, MultipartFile img) {
        try {
            opencourse.setOpenId(UUID.randomUUID().toString());
            Date currentTime=new Date(System.currentTimeMillis());
            opencourse.setCreateTime(currentTime.getTime());
            opencourse.setIsDelete(false);
            opencourse.setUpdateTime(currentTime.getTime());
           if(img != null){
               opencourse.setPhoto(QiniuFile.uploadFile(img.getBytes()));
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openCourseMapper.insertOpenCourse(opencourse);
    }

    /**
     * 修改公共信息课程
     * @param opencourse
     * @param img
     * @return
     */
    @Override
    public Integer updateOpenCourse(OpenCourse opencourse, MultipartFile img) {
        try {
            Date currentTime=new Date(System.currentTimeMillis());
            opencourse.setUpdateTime(currentTime.getTime());
            if(img != null){
                opencourse.setPhoto(QiniuFile.uploadFile(img.getBytes()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openCourseMapper.updateOpenCourse(opencourse);
    }

    /**
     * 删除公共信息课程
     * @param openId
     * @return
     */

    @Override
    public Integer deleteOpenCourse(String openId) {
        Integer delete = openCourseMapper.deleteOpenCourse(openId);
        if(delete==1){
            OpenCourse openCourse = new OpenCourse();
            Date currentTime=new Date(System.currentTimeMillis());
            openCourse.setUpdateTime(currentTime.getTime());
            return openCourseMapper.deleteTime(openCourse);
        }
        return delete;
    }

    /**
     *批量删除公共信息课程
     * @param openIds
     * @return
     */
    @Override
    public Integer deleteOpen(String[] openIds) {
        Integer delete=0;
        for (String openId : openIds) {
            delete = openCourseMapper.deleteOpenCourse(openId);
            if(delete==1){
                OpenCourse openCourse = new OpenCourse();
                Date currentTime=new Date(System.currentTimeMillis());
                openCourse.setUpdateTime(currentTime.getTime());
                openCourseMapper.deleteTime(openCourse);
            }
        }
        return delete;
    }

    /**
     * 更改状态
     * @param openCourse
     * @return
     */
    @Override
    public Integer openCourseState(OpenCourse openCourse) {
        Date currentTime=new Date(System.currentTimeMillis());
        openCourse.setUpdateTime(currentTime.getTime());
        return openCourseMapper.openCourseState(openCourse);
    }
}
