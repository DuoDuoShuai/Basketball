package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.GradeMapper;
import com.yjy.model.Grade;
import com.yjy.service.GradeService;
import com.yjy.util.QiniuFile;
import com.yjy.vo.JsonPageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/30
 * @Description:
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;

    /**
     * 获取当前时间
     */
    private Date currentTime=new Date(System.currentTimeMillis());

    /**
     * 查询+检索
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        Integer count = gradeMapper.count(dto);
        if(count==0){
            return JsonPageResult.successPage();
        }
        List<Grade> list = gradeMapper.list(dto);
        return JsonPageResult.successPage(list,count);
    }

    /**
     * 详情
     * @param gradeId
     * @return
     */
    @Override
    public Grade load(String gradeId) {
        return gradeMapper.load(gradeId);
    }

    /**
     * 修改
     * @param grade
     * @param img
     * @return
     */
    @Override
    public Integer update(Grade grade, MultipartFile img) {
        Integer update = null;
        try {
            grade.setUpdateTime(currentTime.getTime());
            if(img!=null){
                grade.setPhoto(QiniuFile.uploadFile(img.getBytes()));
            }
            update = gradeMapper.update(grade);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return update;
    }

    /**
     * 删除
     * @param gradeId
     * @return
     */
    @Override
    public Integer delete(String gradeId) {
        Integer delete = gradeMapper.delete(gradeId);
        if(delete==1){
            Grade grade=new Grade();
            grade.setUpdateTime(currentTime.getTime());
        }
        return delete;
    }

    /**
     * 批量删除
     * @param gradeIds
     * @return
     */
    @Override
    public Integer deleteMore(String[] gradeIds) {
        Integer delete = null;
        for (String gradeId : gradeIds) {
            delete = gradeMapper.delete(gradeId);
            if(delete==1){
                Grade grade=new Grade();
                grade.setUpdateTime(currentTime.getTime());
            }
        }
        return delete;
    }

    /**
     * 新增
     * @param grade
     * @param img
     * @return
     */
    @Override
    public Integer insert(Grade grade, MultipartFile img) {
        Integer insert = null;
        try {
            grade.setGradeId(UUID.randomUUID().toString());
            grade.setCreateTime(currentTime.getTime());
            grade.setUpdateTime(currentTime.getTime());
            if(img!=null){
                grade.setPhoto(QiniuFile.uploadFile(img.getBytes()));
            }else {
                grade.setPhoto("FmEF-fjs-Qaw2opcZ5BtNVVasfsU");
            }
            insert = gradeMapper.insert(grade);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return insert;
    }
}
