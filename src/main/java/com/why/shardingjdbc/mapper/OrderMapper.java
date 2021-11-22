package com.why.shardingjdbc.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Mapper
@Component
public interface OrderMapper {
    int insertOrder(@Param("price")BigDecimal price, @Param("userId")Long userId, @Param("status")String status);
}
