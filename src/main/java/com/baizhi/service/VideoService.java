package com.baizhi.service;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Video;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【yx_video】的数据库操作Service
* @createDate 2023-06-27 15:09:10
*/
public interface VideoService extends IService<Video> {
    CommonDTO checkVideo(String description,Integer categoryId,String title,Integer userId);

    CommonDTO insertVideo(Video video);

    CommonDTO searchVideo(Integer page,Integer size,String title);
}
