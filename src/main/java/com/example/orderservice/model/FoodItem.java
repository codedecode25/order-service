package com.example.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {
    private int id;

    private String item;

    private String itemDescription;

    private boolean isVeg;

    private Number price;

    private Integer restaurantId;

    private Integer count;
}
