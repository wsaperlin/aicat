package com.wangshen.aicat.web.controller;

import com.wangshen.aicat.domain.Employee;
import com.wangshen.aicat.utils.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("wangshen".equals(employee.getUsername()) && "123456".equals(employee.getPassword())){
            return AjaxResult.me().setMsg("登录成功").setData(employee);
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败").setData(null);
        }
    }

    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public AjaxResult login2(Employee employee){

//        return AjaxResult.me();
        if ("wangshen".equals(employee.getUsername()) && "123456".equals(employee.getPassword())){
            return AjaxResult.me().setMsg("登录成功").setData(employee);
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败").setData(null);
        }
    }

}
