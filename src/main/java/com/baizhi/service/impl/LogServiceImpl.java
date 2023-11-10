package com.baizhi.service.impl;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Log;
import com.baizhi.mapper.LogMapper;
import com.baizhi.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
* @author Administrator
* @description 针对表【yx_log】的数据库操作Service实现
* @createDate 2023-06-28 16:31:15
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log>
    implements LogService{
    @Autowired
    private LogMapper logMapper;

    @Override
    public void addLog(Log log) {
    }

    @Override
    public CommonDTO queryByPage(Integer page, Integer size, Date startTime, Date endTime) {
        CommonDTO result = new CommonDTO();

        return result;
    }
}




