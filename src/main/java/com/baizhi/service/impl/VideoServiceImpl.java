package com.baizhi.service.impl;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Video;
import com.baizhi.mapper.VideoMapper;
import com.baizhi.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【yx_video】的数据库操作Service实现
* @createDate 2023-06-27 15:09:10
*/
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video>
    implements VideoService{
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public CommonDTO checkVideo(String description, Integer categoryId, String title, Integer userId) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO insertVideo(Video video) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO searchVideo(Integer page, Integer size, String title) {
        CommonDTO result = new CommonDTO();

        return result;
    }


}




