package com.huwng05.repository.select;

import com.huwng05.pojo.Category;
import com.huwng05.pojo.Product;
import com.huwng05.repository.curd.SelectRepository;
import com.huwng05.services.CategoryServices;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectCategoryRepo extends SelectRepository<Category> {
    @Override
    public List<Category> getResult(ResultSet rs) throws SQLException {
        List<Category> categorys = new ArrayList<>();
        while (rs.next()) {
            categorys.add(new Category(rs.getInt("id"), rs.getString("name")));
        }
        return categorys;
    }

    @Override
    public String getSQL(List<Object> params) throws SQLException {
        return "select * from " + Category.tableName() + " where 1=1 ";
    }
}
