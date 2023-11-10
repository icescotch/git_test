package com.baizhi.mapper;

import com.baizhi.entity.Video;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends ElasticsearchRepository<Video,Long> {
}
