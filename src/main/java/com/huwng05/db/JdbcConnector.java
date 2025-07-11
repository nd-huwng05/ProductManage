package com.huwng05.db;

import java.sql.Connection;
import java.sql.SQLException;

public interface JdbcConnector {
    Connection connect() throws SQLException;
    void close() throws SQLException;
}
