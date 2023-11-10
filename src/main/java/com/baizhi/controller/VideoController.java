package com.baizhi.controller;

import com.baizhi.dto.CommonDTO;
import com.baizhi.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @PostMapping("upload")
    public CommonDTO upload(MultipartFile file,String description,Integer categoryId,String title,Integer userId){
        return null;
    }

    @GetMapping("searchVideo")
    public CommonDTO searchVideo(Integer page,Integer size,String title){
        return null;
    }
}
