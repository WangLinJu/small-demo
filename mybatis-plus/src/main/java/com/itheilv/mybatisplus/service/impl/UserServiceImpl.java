package com.itheilv.mybatisplus.service.impl;

import com.itheilv.mybatisplus.model.User;
import com.itheilv.mybatisplus.mapper.UserMapper;
import com.itheilv.mybatisplus.service.UserService;
import com.itheilv.mybatisplus.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户详情 服务实现类
 *
 * @author WSQ
 * @since 2020-09-29
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

}

