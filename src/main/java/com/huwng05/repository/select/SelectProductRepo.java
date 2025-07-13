package com.huwng05.repository.select;

import com.huwng05.pojo.Product;
import com.huwng05.repository.curd.SelectRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectProductRepo extends SelectRepository<Product> {

    @Override
    public String getSQL(List<Object> params) throws SQLException {
        return "select * from " + Product.tableName() + " where 1=1 ";
    }

    @Override
    public List<Product> getResult(ResultSet rs) throws SQLException {
        List<Product> products = new ArrayList<>();
        while (rs.next()) {
            products.add(new Product.Builder(rs.getInt("id"), rs.getString("name")).setPrice(rs.getDouble("price")).build());
        }
        return products;
    }
}
