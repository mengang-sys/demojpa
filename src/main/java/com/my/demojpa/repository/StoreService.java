package com.my.demojpa.repository;

import com.my.demojpa.entity.Store;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class StoreService {

    @Autowired
    private StoreDao storeDao;

    public List<Store> findByShopList(Integer id){
        return storeDao.findByShopList(id);
    }
}
