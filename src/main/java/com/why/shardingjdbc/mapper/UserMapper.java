package com.why.shardingjdbc.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long insertUser(@Param("userId") Long userId,@Param("userName") String userName,@Param("age") int age);
}
