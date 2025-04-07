package com.demo.crud.Util;
import com.demo.crud.DAO.InventoryDAO;
import com.demo.crud.DTO.InventoryDTO;
import java.util.List;

public class Tester {

    public static void main(String[] args) {

        InventoryDAO inventoryDAO = new InventoryDAO();

        // 1. Create new inventory record
        InventoryDTO newInventory = new InventoryDTO();
        newInventory.setProductName("Laptop");
        newInventory.setProductAmount(50);
        newInventory.setCategory("Electronics");
        newInventory.setProductModel("XYZ123");
        inventoryDAO.save(newInventory);

        // 2. Retrieve all inventories
        List<InventoryDTO> inventories = inventoryDAO.getAllInventories();
        for (InventoryDTO inv : inventories) {
            System.out.println("Product ID: " + inv.getProductId() + ", Name: " + inv.getProductName());
        }      
        inventoryDAO.delete(30);
        inventoryDAO.updateInventoryByCondition();
    }
}
