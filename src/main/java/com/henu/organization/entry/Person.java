package com.henu.organization.entry;

import com.henu.common.BaseModel;

import java.util.Date;

/**
 * Created by junwei on 2016/7/3.
 */
public class Person  extends BaseModel {
    private String id;
    //用户英文名
    private String userEname;

    //MD5加密密码
    private String md5Pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserEname() {
        return userEname;
    }

    public void setUserEname(String userEname) {
        this.userEname = userEname;
    }

    public String getMd5Pwd() {
        return md5Pwd;
    }

    public void setMd5Pwd(String md5Pwd) {
        this.md5Pwd = md5Pwd;
    }
}
