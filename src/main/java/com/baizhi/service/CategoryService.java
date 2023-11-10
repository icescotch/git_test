package com.baizhi.service;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【yx_category】的数据库操作Service
* @createDate 2023-06-25 16:42:52
*/
public interface CategoryService extends IService<Category> {
    CommonDTO queryLevels(Integer page,Integer size,Integer levels,Integer parentId);

    CommonDTO addCategory(String cateName,Integer levels,Integer parentId);

    CommonDTO editName(String cateName,Integer id);

    CommonDTO deleteCategory(Integer id);
}
