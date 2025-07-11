package com.huwng05.repository.repo;

import com.huwng05.db.connector.MySQLConnector;
import com.huwng05.repository.ProductRepo;

import java.sql.Connection;
import java.sql.SQLException;

public class ProductRepoImp implements ProductRepo {
    private final Connection connection = MySQLConnector.getInstance().connect();

    public ProductRepoImp() throws SQLException {}
}
