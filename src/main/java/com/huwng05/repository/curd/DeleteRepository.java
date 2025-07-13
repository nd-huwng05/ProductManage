package com.huwng05.repository.curd;

import com.huwng05.repository.Repository;

import java.sql.SQLException;

public abstract class DeleteRepository<T> extends Repository<T> {
    public boolean deleteResult() throws SQLException {
        return this.getStatement().executeUpdate() > 0;
    }
}
