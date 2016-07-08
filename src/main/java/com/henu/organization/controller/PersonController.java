package com.henu.organization.controller;

import com.henu.organization.entry.Person;
import com.henu.organization.manager.PersonManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by junwei on 2016/7/3.
 */
@Controller
@RequestMapping("person")
public class PersonController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    PersonManager personManager;
    @RequestMapping("login")
    @ResponseBody
    public  Map<String, Object>  login(HttpServletRequest request,
                        String userName, String passWord){
      userName="admin";
      logger.info(userName+"正在登陆系统...");
        Map<String, Object> model = new HashMap<String, Object>();
        Person p=new Person();p.setUserEname(userName);p.setMd5Pwd(passWord);
        Person person = null;
        person = personManager.find(p);
        if(person!=null) {
            model.put("loginUrl", "person/show.do");
            model.put("loginMsg", "登陆成功!");
            return  model;
        }else {
            model.put("loginMsg", "登录失败:用户名或密码错误!");
            return model;
        }
    }
    @RequestMapping("/show")
    public String openShow(){
        return  "show";
    }


}
