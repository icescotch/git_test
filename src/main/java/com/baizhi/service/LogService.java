package com.baizhi.service;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Log;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Date;

/**
* @author Administrator
* @description 针对表【yx_log】的数据库操作Service
* @createDate 2023-06-28 16:31:15
*/
public interface LogService extends IService<Log> {
    //由于添加日志，是后台自动静默执行，所以无需返回值
    void addLog(Log log);

    CommonDTO queryByPage(Integer page, Integer size, Date startTime,Date endTime);
}
