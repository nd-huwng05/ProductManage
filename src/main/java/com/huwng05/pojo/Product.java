package com.huwng05.pojo;
import java.time.LocalDateTime;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int category_id;
    private int supplier_id;

    public Product (Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
        this.quantity = builder.quantity;
        this.category_id = builder.category_id;
        this.supplier_id = builder.supplier_id;
    }

    public static String tableName() {
        return "products";
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static class Builder {
        private int id;
        private String name;
        private double price;
        private int quantity;
        private int category_id;
        private int supplier_id;

        public Builder (int id, String name, int category_id, int supplier_id) {
            this.id = id;
            this.name = name;
            this.category_id = category_id;
            this.supplier_id = supplier_id;
        }

        public Builder (String name, int category_id, int supplier_id) {
            this.name = name;
            this.category_id = category_id;
            this.supplier_id = supplier_id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setCategory_id(int category_id) {
            this.category_id = category_id;
            return this;
        }

        public Builder setSupplier_id(int supplier_id) {
            this.supplier_id = supplier_id;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
}

