package com.baizhi.controller;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Author: LiJin
 * @Date: 2022/9/16
 * @Description:
 */
@RestController
@RequestMapping("api/admin")
@Slf4j
public class AdminController {
    @Autowired
    private AdminService adminService;


    @GetMapping("getVerifyImage")
    public CommonDTO getVerifyImage() throws IOException {
        return null;
    }

    @PostMapping("login")
    public CommonDTO login(@RequestBody Admin admin, String code){
        return null;
    }

    @GetMapping("logout")
    public CommonDTO logout() {
        return null;
    }

    @GetMapping("me")
    public CommonDTO me(){
        return null;
    }

    @PostMapping("addAdmin")
    public CommonDTO addAdmin(@RequestBody Admin admin){
        return null;
    }

    @GetMapping("queryByPage")
    public CommonDTO queryByPage(Integer page,Integer size){
        return null;
    }

    @PostMapping("changePassword")
    public CommonDTO changePassword(@RequestBody Admin admin){
        return null;
    }

    @GetMapping("deleteAdmin")
    public CommonDTO deleteAdmin(Integer id){
        return null;
    }
}
