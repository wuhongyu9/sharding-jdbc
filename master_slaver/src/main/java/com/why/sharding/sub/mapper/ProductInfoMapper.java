package com.why.sharding.sub.mapper;

import com.why.sharding.sub.entity.ProductInfo;
import org.apache.ibatis.annotations.Param;

public interface ProductInfoMapper {
    long insertProductInfo(@Param("productInfo")ProductInfo productInfo);
}
