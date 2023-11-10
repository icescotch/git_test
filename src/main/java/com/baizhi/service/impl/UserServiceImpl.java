package com.baizhi.service.impl;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import com.baizhi.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【yx_user】的数据库操作Service实现
* @createDate 2023-06-26 16:32:04
*/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public CommonDTO sendVerificationCode(String phone) throws Exception{
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO checkVerificationCode(String phone, String code) {
        CommonDTO result = new CommonDTO();

        return result;
    }

    @Override
    public CommonDTO queryByPage(Integer page, Integer size) {
        return null;
    }

    @Override
    public CommonDTO toggleStatus(User user) {
        return null;
    }
}




