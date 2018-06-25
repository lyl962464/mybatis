package com.mybatis.dao;

import com.mybatis.entity.UserShrio;

public interface UserShrioMapper {
    int insert(UserShrio record);

    int insertSelective(UserShrio record);
}