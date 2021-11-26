package com.why.sharding.sub.mapper;

import com.why.sharding.sub.entity.ProductDesc;
import org.apache.ibatis.annotations.Param;

public interface ProductDescriptMapper {
    long insertProductDescript(ProductDesc productDescript);
}
