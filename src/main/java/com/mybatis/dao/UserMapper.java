package com.mybatis.dao;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface  UserMapper {
  User  getUserList(String id);
}
