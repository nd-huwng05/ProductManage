package com.huwng05.repository;

import com.huwng05.db.connector.MySqlConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class Repository<T> {
    public static Connection cnn;
    static {
        try {
            cnn = MySqlConnector.getInstance().connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public abstract String getSQL(List<Object> params) throws SQLException;
    public PreparedStatement getStatement() throws SQLException {
        List<Object> params = new ArrayList<>();
        PreparedStatement stm = cnn.prepareCall(this.getSQL(params));
        for (int i = 0; i < params.size(); i++) {
            stm.setObject(i + 1, params.get(i));
        }
        return stm;
    }
}
