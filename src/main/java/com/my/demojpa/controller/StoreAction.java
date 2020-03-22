package com.my.demojpa.controller;

import com.my.demojpa.entity.Shop;
import com.my.demojpa.entity.Store;
import com.my.demojpa.repository.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/store")
public class StoreAction {

    @Autowired
    private StoreService storeService;

    @RequestMapping("/showShop")
    public String showShop(HttpServletResponse response, HttpServletRequest request, Model model){

        String id = request.getParameter("store_id");
        //通过HQL语句拿到id=？的商铺，并拿到该店铺下的所有商品
        List<Store> list = storeService.findByShopList(Integer.valueOf(id));
        //返回一个Store集合，Store类和Shop类为一对多，Store下的shops为List<Shop>
        List<Shop> shopList = new ArrayList<Shop>();
        //循环遍历拿到每一个shop，添加一个新的List<Shop>中 用于将数据在前台展示
        for (Store store : list) {
            System.out.println(store.getName());
            for (Shop shop : store.getShops()) {
                System.out.println(shop.getName());
                shopList.add(shop);
            }

        }

        model.addAttribute("list",shopList);
        return "addmin/showShop";
    }
}
