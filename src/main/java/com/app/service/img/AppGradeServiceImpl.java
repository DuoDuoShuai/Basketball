package com.app.service.img;

import com.app.dto.CountDto;
import com.app.mapper.AppGradeMapper;
import com.app.service.AppGradeService;
import com.app.model.AppGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/9/6
 * @Description:
 */
@Service
public class AppGradeServiceImpl implements AppGradeService {
    @Autowired
    private AppGradeMapper gradeMapper;
    /**
     * 根据校区名称查询该校区下所有的班级+该班级总人数
     * @param dto
     * @return
     */
    @Override
    public List<AppGrade> listAll(CountDto dto) {
        List<AppGrade> grades = gradeMapper.listAll(dto);
        for (AppGrade grade : grades) {
            Integer count = gradeMapper.count(dto);
            grade.setCount(count);
            //把最终完整数据grade重新放入集合中
            
        }
        return null;
    }

    /**
     * 根据校区名称添加新班级
     * @param grade 新建班级对象
     * @return
     */
    @Override
    public Integer insertGrade(AppGrade grade) {
        return gradeMapper.insertGrade(grade);
    }

}
