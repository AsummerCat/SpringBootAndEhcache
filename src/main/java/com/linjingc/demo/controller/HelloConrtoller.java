package com.linjingc.demo.controller;

import com.linjingc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author cxc
 * @date 2018/10/8 17:09
 */
@RestController
@RequestMapping("hello")
public class HelloConrtoller {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public String index(){
        return "helloWord";
    }

    @RequestMapping(value = "findUser")
    public String findUser( String id){
       return userService.findUser(id);
    }

    @RequestMapping(value = "delUser")
    public String delUser( String id){
         userService.delUser(id);
        return "删除success";
    }

    @RequestMapping(value = "updateUser")
    public String updateUser( String id){
        userService.updateUser(id);
        return "更新success";
    }

}
