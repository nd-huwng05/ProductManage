package com.huwng05.repository.update;

import com.huwng05.pojo.Product;
import com.huwng05.repository.curd.UpdateRepository;

import java.sql.SQLException;
import java.util.List;

public class UpdateProductRepo extends UpdateRepository<Product> {

    @Override
    public String getSQL(List<Object> params) throws SQLException {
        return "update " + Product.tableName() + "SET ";
    }
}
