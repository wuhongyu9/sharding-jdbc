package com.why.shardingjdbc.mapper;

import com.why.shardingjdbc.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Component
public interface OrderMapper {
    int insertOrder(@Param("price")BigDecimal price, @Param("userId")Long userId, @Param("status")String status);

    List<Order> getOrders(@Param("ids") List<Long> ids);

    List<Order> orderById();
}
