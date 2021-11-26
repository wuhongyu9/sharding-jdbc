package com.why.sharding.sub.mapper;

import com.why.sharding.sub.entity.StoreInfo;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    long insertStoreInfo(@Param("storeInfo")StoreInfo storeInfo);
}
