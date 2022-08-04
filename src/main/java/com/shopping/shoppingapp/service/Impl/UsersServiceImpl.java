package com.shopping.shoppingapp.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shopping.shoppingapp.entity.Users;
import com.shopping.shoppingapp.mapper.UsersMapper;
import com.shopping.shoppingapp.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
}
