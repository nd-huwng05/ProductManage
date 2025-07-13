package com.huwng05.repository.select.product;

import com.huwng05.pojo.Product;
import com.huwng05.repository.curd.SelectRepository;
import com.huwng05.repository.select.SelectDecorator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GetProductById extends SelectDecorator<Product> {

    protected GetProductById(SelectRepository<Product> root) throws SQLException {
        super(root);
    }

    @Override
    public String getSQL(List<Object> params) throws SQLException {
        return this.root.getSQL(params);
    }
}
