package com.baizhi.controller;

import com.baizhi.dto.CommonDTO;
import com.baizhi.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/log")
public class LogController {
    @Autowired
    private LogService logService;

    @GetMapping("queryByPage")
    public CommonDTO queryByPage(Integer page, Integer size, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startTime,@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endTime){
        return null;
    }
}
