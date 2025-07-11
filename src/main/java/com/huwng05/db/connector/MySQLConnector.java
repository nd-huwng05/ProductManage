package com.huwng05.db.connector;

import com.huwng05.db.JdbcConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector implements JdbcConnector {
    private static JdbcConnector instance;
    private Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private MySQLConnector() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/manage_product", "root", "root");
    }

    public static JdbcConnector getInstance() throws SQLException {
        if(instance==null) instance= new MySQLConnector();
        return instance;
    }

    @Override
    public Connection connect() throws SQLException {
        return this.connection;
    }

    public void close() throws SQLException {
        if(this.connection!=null) this.connection.close();
    }
}
