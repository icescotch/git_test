package com.baizhi.mapper;

import com.baizhi.entity.Video;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【yx_video】的数据库操作Mapper
* @createDate 2023-06-27 15:09:10
* @Entity com.baizhi.entity.Video
*/
public interface VideoMapper extends BaseMapper<Video> {
    List<Video> queryVideoByPage(@Param("skip") Integer skip,@Param("size") Integer size,@Param("idList") List<Integer> idList);

    void insertVideo(Video video);
}




