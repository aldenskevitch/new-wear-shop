package com.solvd.newwearshop.product;

public enum ProductType {
    PANTS("Pants"), SHIRT("Shirt"), OUTERWEAR("Outerwear"), SUNGLASSES("Sunglasses");

    private final String description;

    ProductType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
