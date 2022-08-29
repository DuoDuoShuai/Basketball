package com.yjy.controller;

import com.yjy.dto.LayUiDto;
import com.yjy.model.Users;
import com.yjy.service.UsersService;
import com.yjy.vo.JsonResult;
import com.yjy.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:
 */
@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("go")
    public String go(){
        return "usertable";
    }
    @RequestMapping("list")
    @ResponseBody
    public MapVo list(LayUiDto dto){
        MapVo map = usersService.list(dto);
//        JsonResult data = JsonResult.success(map);
        return map;
    }
    @RequestMapping("info")
    @ResponseBody
    public void info(Integer userid,Model model){
        Users users = usersService.info(userid);
        model.addAttribute("users",users);
    }
    @RequestMapping("infos")
    @ResponseBody
    public void infos(@RequestParam("id[]") Integer[] id,Model model){
        Users users = usersService.infos(id);
        model.addAttribute("users",users);
    }
    @RequestMapping("goedit")
    public String goedit(){
        return "useredit";
    }
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(Users users){
        Integer update = usersService.update(users);
        JsonResult success = JsonResult.success(update);
        return success;
    }
    @RequestMapping("removemore")
    @ResponseBody
    public JsonResult removemore(@RequestParam("userids[]")Integer[] userids){
        Integer remove = usersService.removeMore(userids);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
    @RequestMapping("remove")
    @ResponseBody
    public JsonResult remove(Integer userid){
        Integer remove = usersService.remove(userid);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
}
