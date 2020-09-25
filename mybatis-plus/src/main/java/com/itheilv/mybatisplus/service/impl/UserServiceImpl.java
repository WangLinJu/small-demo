package com.itheilv.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheilv.mybatisplus.mapper.UserMapper;
import com.itheilv.mybatisplus.model.User;
import com.itheilv.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author WSQ
 * @since 2020-09-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
