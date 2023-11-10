package com.baizhi.service;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【yx_user】的数据库操作Service
* @createDate 2023-06-26 16:32:04
*/
public interface UserService extends IService<User> {
    CommonDTO sendVerificationCode(String phone) throws Exception;
    CommonDTO checkVerificationCode(String phone,String code);

    public CommonDTO queryByPage(Integer page,Integer size);

    public CommonDTO toggleStatus(User user);
}
