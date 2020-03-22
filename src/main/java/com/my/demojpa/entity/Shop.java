package com.my.demojpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Shop {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private int price;

    private int tel;

    private String info;

    private String address;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

}
