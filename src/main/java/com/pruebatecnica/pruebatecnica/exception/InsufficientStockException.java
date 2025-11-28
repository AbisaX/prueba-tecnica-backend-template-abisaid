package com.pruebatecnica.pruebatecnica.exception;

public class InsufficientStockException extends RuntimeException {
    private final String productName;
    private final Integer requestedQuantity;
    private final Integer availableStock;
    
    public InsufficientStockException(String productName, Integer requestedQuantity, Integer availableStock) {
        super(String.format("Insufficient stock for product '%s'. Requested: %d, Available: %d", 
              productName, requestedQuantity, availableStock));
        this.productName = productName;
        this.requestedQuantity = requestedQuantity;
        this.availableStock = availableStock;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public Integer getRequestedQuantity() {
        return requestedQuantity;
    }
    
    public Integer getAvailableStock() {
        return availableStock;
    }
}