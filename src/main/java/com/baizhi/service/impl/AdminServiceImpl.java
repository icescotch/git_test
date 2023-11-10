package com.baizhi.service.impl;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Admin;
import com.baizhi.mapper.AdminMapper;
import com.baizhi.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【yx_admin】的数据库操作Service实现
* @createDate 2023-06-20 17:18:27
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public CommonDTO addAdmin(String username, String password) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO login(String username, String password) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO queryByPage(Integer page, Integer size) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO changePassword(Integer id, String password) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO deleteAdmin(Integer id) {
        CommonDTO result = new CommonDTO();

        return result;
    }


}




