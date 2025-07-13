package com.huwng05.handler;

import com.huwng05.pojo.Category;
import com.huwng05.pojo.Product;
import com.huwng05.services.CategoryServices;
import com.huwng05.services.ProductServices;

import java.sql.SQLException;
import java.util.List;

public class Handler {
    private ProductServices productServices = new ProductServices();
    private CategoryServices categoryServices = new CategoryServices();

    public List<Product> loadListProducts() throws SQLException {
        return productServices.list();
    }

    public List<Category> loadListCategory() throws SQLException {
        return categoryServices.list();
    }
}
