package com.demo.crud.DTO;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class InventoryDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_amount")
    private int productAmount;

    @Column(name = "category")
    private String category;

    @Column(name = "product_model")
    private String productModel;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	@Override
	public String toString() {
		return "InventoryDTO [productId=" + productId + ", productName=" + productName + ", productAmount="
				+ productAmount + ", category=" + category + ", productModel=" + productModel + "]";
	}

    
}
