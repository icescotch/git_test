package com.baizhi.service.impl;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Category;
import com.baizhi.mapper.CategoryMapper;
import com.baizhi.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【yx_category】的数据库操作Service实现
* @createDate 2023-06-25 16:42:52
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public CommonDTO queryLevels(Integer page, Integer size, Integer levels, Integer parentId) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO addCategory(String cateName, Integer levels, Integer parentId) {
        CommonDTO result=new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO editName(String cateName, Integer id) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO deleteCategory(Integer id) {
        CommonDTO result = new CommonDTO();

        return result;
    }
}




