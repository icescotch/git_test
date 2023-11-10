package com.baizhi.service;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【yx_admin】的数据库操作Service
* @createDate 2023-06-20 17:18:27
*/
public interface AdminService extends IService<Admin> {
    public CommonDTO addAdmin(String username,String password);

    public CommonDTO login(String username,String password);

    CommonDTO queryByPage(Integer page, Integer size);

    CommonDTO changePassword(Integer id,String password);

    CommonDTO deleteAdmin(Integer id);
}
