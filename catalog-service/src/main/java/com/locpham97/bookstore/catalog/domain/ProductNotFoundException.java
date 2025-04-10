package com.locpham97.bookstore.catalog.domain;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String s) {
        super(s);
    }

    public static RuntimeException forCode(String code) {
        return new ProductNotFoundException("Product with code " + code + " not found");
    }
}
