package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.StudentMapper;
import com.yjy.model.Student;
import com.yjy.service.StudentService;
import com.yjy.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/29
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    /**
     * 列表
     * @param dto
     * @return 返回mapvo页面表格数据
     */
    @Override

    public MapVo list(LayUiDto dto) {
        Integer count = studentMapper.count(dto);
        if(count==0){
            return MapVo.successPage();
        }
        List<Student> list = studentMapper.list(dto);
        MapVo mapVo = MapVo.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     * @param id
     * @return 返回已个学生对象
     */
    @Override
    public Student info(Integer id) {
        Student student = studentMapper.info(id);
        return student;
    }


    /**
     * 修改
     * @param student
     * @return 成功返回整数i=1
     */
    @Override
    public Integer update(Student student) {
        Date currentTime=new Date(System.currentTimeMillis());
        student.setUpdateTimes(currentTime.getTime());
        student.setBirthday(student.getSage().getTime());
        Integer update = studentMapper.update(student);
        return update;
    }

    /**
     * 删除
     * @param id
     * @return 成功返回整数i=1
     */
    @Override
    public Integer remove(Integer id) {
        Integer remove = studentMapper.remove(id);
        return remove;
    }

    /**
     * 批量删除
     * @param ids
     * @return 成功返回整数i=1
     */
    @Override
    public Integer removeMore(Integer[] ids) {
        Integer remove=0;
        for (Integer id : ids) {
            remove = studentMapper.remove(id);
        }
        return remove;
    }

    /**
     * 增加
     * @param student
     * @return 成功返回整数i=1
     */
    @Override
    public Integer add(Student student) {
        student.setId(String.valueOf(UUID.randomUUID()));
        Date currentTime=new Date(System.currentTimeMillis());
        student.setCreateTimes(currentTime.getTime());
        student.setUpdateTimes(currentTime.getTime());
        student.setBirthday(student.getSage().getTime());
        Integer add = studentMapper.add(student);
        return add;
    }
}
