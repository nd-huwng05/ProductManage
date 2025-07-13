package com.huwng05.services;

import com.huwng05.pojo.Product;
import com.huwng05.repository.Repository;
import com.huwng05.repository.cache.Cache;
import com.huwng05.repository.curd.SelectRepository;
import com.huwng05.repository.select.SelectProductRepo;

import java.sql.SQLException;
import java.util.List;

public class ProductServices {
    public List<Product> list() throws SQLException {
        SelectRepository<Product> repo = new SelectProductRepo();
        return Cache.getData(repo, Product.tableName());
    }


}
