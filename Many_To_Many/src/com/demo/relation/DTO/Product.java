package com.demo.relation.DTO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String productName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "product_product_model",  // Join table name
        joinColumns = @JoinColumn(name = "product_id"),  // Foreign key column in product_product_model pointing to Product
        inverseJoinColumns = @JoinColumn(name = "model_id")  // Foreign key column in product_product_model pointing to ProductModel
    )
    private Set<ProductModel> productModels = new HashSet<>();

    public Product() {}

    public Product(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Set<ProductModel> getProductModels() {
        return productModels;
    }

    public void setProductModels(Set<ProductModel> productModels) {
        this.productModels = productModels;
    }
}
