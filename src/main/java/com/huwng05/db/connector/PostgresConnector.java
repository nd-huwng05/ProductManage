package com.huwng05.db.connector;

import com.huwng05.db.JdbcConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnector implements JdbcConnector {
    private static JdbcConnector instance;
    private Connection connection;
    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private PostgresConnector() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/manage_product", "root", "root");
    }

    public static JdbcConnector getInstance() throws SQLException {
        if (instance == null) instance = new PostgresConnector();
        return instance;
    }

    @Override
    public Connection connect() throws SQLException {
        return this.connection;
    }

    @Override
    public void close() throws SQLException {
        if (this.connection != null) this.connection.close();
    }
}
