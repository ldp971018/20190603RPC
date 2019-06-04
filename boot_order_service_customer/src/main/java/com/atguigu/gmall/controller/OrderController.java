package com.atguigu.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Return
 * @create 2019-06-03 17:11
 */

@Controller
public class OrderController {

    @Reference
    UserService userService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId){
        return  userService.getUserAddressList(userId);
    }
}
