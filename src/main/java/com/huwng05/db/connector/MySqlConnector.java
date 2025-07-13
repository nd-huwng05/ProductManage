package com.huwng05.db.connector;

import com.huwng05.db.DB;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnector extends DB {
    private static MySqlConnector instance;
    private MySqlConnector() throws SQLException {
        super();
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage_product","root","root");
    }

    @Override
    protected String getDriver() {
        return "com.mysql.cj.jdbc.Driver";
    }

    public static MySqlConnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new MySqlConnector();
        }
        return instance;
    }
}
