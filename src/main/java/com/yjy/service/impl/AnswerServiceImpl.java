package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.AnsewrMapper;
import com.yjy.model.Ansewr;
import com.yjy.service.AnswerService;
import com.yjy.vo.JsonPageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 徐晓瑞
 * @date 2022/9/5 16:16
 * @describe:
 */

@Service
public class AnswerServiceImpl implements AnswerService {

    @Resource
    private AnsewrMapper ansewrMapper;

    /**
     * 查询全部
     * @param dto
     * @return
     */
    @Override
    public JsonPageResult list(LayUiDto dto) {
        //判断是否有数据
        Integer count = ansewrMapper.count(dto);
        if(count ==0) {
            return JsonPageResult.successPage();
        }
        List<Ansewr> list = ansewrMapper.list(dto);
        JsonPageResult map = JsonPageResult.successPage(list, count);
        return map;
    }

    /**
     * 添加
     * @param ansewr
     * @return
     */
    @Override
    public Integer insertAnswer(Ansewr ansewr) {
        ansewr.setOpenAnsewrId(UUID.randomUUID().toString());
        Date currentTime=new Date(System.currentTimeMillis());
        ansewr.setCreateTime(currentTime.getTime());
        return ansewrMapper.insertAnsewr(ansewr);
    }

    /**
     * 批量删除
     * @param str
     * @return
     */
    @Override
    public Integer deleteAnswerMore(String str) {
        String[] split = str.split(",");
        Integer integer = 0;
        for (String s : split) {
            Ansewr ansewr = new Ansewr();
            ansewr.setOpenAnsewrId(s);
            Date currentTime = new Date(System.currentTimeMillis());
            ansewr.setUpdateTime(currentTime.getTime());
            ansewrMapper.updateTime(ansewr);
            integer = ansewrMapper.deleteAnsewr(ansewr);
        }
        return integer;
    }

    /**
     * 删除单条
     * @param ansewrId
     * @return
     */
    @Override
    public Integer deleteAnswer(String ansewrId) {
        Ansewr ansewr = new Ansewr();
        ansewr.setOpenAnsewrId(ansewrId);
        Date currentTime = new Date(System.currentTimeMillis());
        ansewr.setUpdateTime(currentTime.getTime());
        ansewrMapper.updateTime(ansewr);
        return ansewrMapper.deleteAnsewr(ansewr);
    }

    /**
     * 修改
     * @param ansewr
     * @return
     */
    @Override
    public Integer updateAnswer(Ansewr ansewr) {
        Date currentTime=new Date(System.currentTimeMillis());
        ansewr.setUpdateTime(currentTime.getTime());
        return ansewrMapper.updateAnsewr(ansewr);
    }
}
