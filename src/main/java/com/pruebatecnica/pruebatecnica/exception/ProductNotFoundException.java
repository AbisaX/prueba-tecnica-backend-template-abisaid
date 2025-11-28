package com.pruebatecnica.pruebatecnica.exception;

public class ProductNotFoundException extends RuntimeException {
    private final Long productId;
    
    public ProductNotFoundException(Long productId) {
        super(String.format("Product not found with ID: %d", productId));
        this.productId = productId;
    }
    
    public Long getProductId() {
        return productId;
    }
}