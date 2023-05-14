package com.example.orderservice.enitity;

import com.example.orderservice.model.FoodItem;
import com.example.orderservice.model.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document("order")
public class Order {
    private int id;

    private List<FoodItem> foodItems;

    private Restaurant restaurant;

}
