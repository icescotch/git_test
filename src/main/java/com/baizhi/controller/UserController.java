package com.baizhi.controller;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("queryByPage")
    public CommonDTO queryByPage(Integer page,Integer size){
        return null;
    }

    @PostMapping("toggleStatus")
    public CommonDTO toggleStatus(@RequestBody User user){
        return null;
    }

    @PostMapping("sendVerificationCode")
    public CommonDTO sendVerificationCode(@RequestBody HashMap<String,String> map)throws Exception{
        return null;
    }

    @PostMapping("checkVerificationCode")
    public CommonDTO checkVerificationCode(@RequestBody HashMap<String,String> map){
        return null;
    }
}
