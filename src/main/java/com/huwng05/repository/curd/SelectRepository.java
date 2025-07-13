package com.huwng05.repository.curd;

import com.huwng05.repository.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class SelectRepository<T> extends Repository<T> {
    public abstract List<T> getResult(ResultSet rs) throws SQLException;
    public List<T> list() throws SQLException {
        PreparedStatement stm =  this.getStatement();
        return this.getResult(stm.executeQuery());
    }
}
