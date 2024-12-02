package com.grocery.grocerystore.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Produ")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;
    private String description;
}
