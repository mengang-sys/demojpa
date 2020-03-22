package com.my.demojpa.repository;

import com.my.demojpa.entity.Store;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreDao extends CrudRepository<Store,Integer> {

    //此方法通过内连接查询店铺id=？中的所有商品
    @Query("select distinct s from Store s inner join s.shops where s.id = ?3")
    List<Store> findByShopList(Integer id);


}
