package com.jy.mapper.user;

import com.jy.pojo.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insert(User user);
}
