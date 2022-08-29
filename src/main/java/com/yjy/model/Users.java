package com.yjy.model;


/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:数据库中的user表
 */
public class Users {
    private String userid;
    private String username;
    private String userportrait;
    private String userphone;

    private Integer isdelete;

    private Long createtime;

    private Long updatetime;
    private Integer guardianid;

    public Users() {
    }

    public Users(String userid, String username, String userportrait, String userphone, Integer guardianid) {
        this.userid = userid;
        this.username = username;
        this.userportrait = userportrait;
        this.userphone = userphone;
        this.guardianid = guardianid;
    }

    public Users(String userid, String username, String userportrait, String userphone, Integer isdelete, Long createtime, Long updatetime, Integer guardianid) {
        this.userid = userid;
        this.username = username;
        this.userportrait = userportrait;
        this.userphone = userphone;
        this.isdelete = isdelete;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.guardianid = guardianid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getGuardianid() {
        return guardianid;
    }

    public void setGuardianid(Integer guardianid) {
        this.guardianid = guardianid;
    }

    public String getUserportrait() {
        return userportrait;
    }

    public void setUserportrait(String user_portrait) {
        this.userportrait = userportrait;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

}
