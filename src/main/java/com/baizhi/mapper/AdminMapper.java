package com.baizhi.mapper;

import com.baizhi.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【yx_admin】的数据库操作Mapper
* @createDate 2023-06-20 17:18:27
* @Entity com.baizhi.entity.Admin
*/
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

}




