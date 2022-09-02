package com.yjy.service;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Parent;
import com.yjy.model.Teacher;
import com.yjy.vo.JsonPageResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 17:14
 * @describe: TODO-
 */
public interface TeacherService {

    /**
     * 教练信息查询全部
     * @param dto
     * @return
     */
    JsonPageResult list(LayUiDto dto);

    /**
     * 添加教练信息
     * @param teacher
     * @return
     */
    Integer insertTeacher(Teacher teacher, MultipartFile img);

    /**
     * 批量删除教练信息
     * @param str
     * @return
     */
    Integer deleteTeacherMore(String str);

    /**
     * 删除教练信息
     * @param teacherId
     * @return
     */
    Integer deleteTeacher(String teacherId);

    /**
     * 修改教练信息
     * @param teacher
     * @return
     */
    Integer updateTeacher(Teacher teacher,MultipartFile img);
}
