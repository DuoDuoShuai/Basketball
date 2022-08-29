package com.yjy.service.impl;

import com.yjy.dto.LayUiDto;
import com.yjy.mapper.UsersMapper;
import com.yjy.model.Users;
import com.yjy.service.UsersService;
import com.yjy.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
//
//    @Override
//    public Map<String, Object> list(LayUiDto dto) {
//        Integer count = usersMapper.count(dto);
//        if(count==0){
//            return null;
//        }
//        Map<String, Object> map=new HashMap<>();
//        map.put("code",0);
//        map.put("msg","");
//        map.put("count",count);
//        map.put("data",usersMapper.list(dto));
//        return map;
//    }
    @Override
    public MapVo list(LayUiDto dto) {
        //判断是否有数据
        Integer count = usersMapper.count(dto);
        if(count ==0) {
            return MapVo.successPage();
        }
        List<Users> list = usersMapper.list(dto);
        MapVo map = MapVo.successPage(list, count);
        return map;
    }

    /**
     * 详情
     * @param userid
     * @return
     */
    @Override
    public Users info(Integer userid) {
        Users users = usersMapper.info(userid);
        return users;
    }

    @Override
    public Users infos(Integer[] userid) {
        Users users=null;
        for (Integer id : userid) {
            users = usersMapper.info(id);
        }
        return users;
    }

    /**
     * 修改
     * @param users
     * @return
     */
    @Override
    public Integer update(Users users) {
        Integer i = usersMapper.update(users);
        return i;
    }

    /**
     * 删除
     * @param userid
     * @return
     */
    @Override
    public Integer remove(Integer userid) {
        Integer i = usersMapper.remove(userid);
        return i;
    }

    @Override
    public Integer removeMore(Integer[] userids) {
        Integer i=0;
        for (Integer userid : userids) {
            i= usersMapper.remove(userid);
        }
        return i;
    }
}
