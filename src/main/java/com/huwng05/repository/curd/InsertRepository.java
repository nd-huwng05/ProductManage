package com.huwng05.repository.curd;

import com.huwng05.repository.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class InsertRepository<T> extends Repository<T> {
    public boolean insertResult() throws SQLException {
        return this.getStatement().executeUpdate() > 0;
    }
    public int generatedKey() throws SQLException {
        PreparedStatement stm = this.getStatement();
        if(stm.executeUpdate() > 0) {
            ResultSet rs = stm.getGeneratedKeys();
            return rs.next() ? rs.getInt(1) : -1;
        }
        return -1;
    }
}
