package com.huwng05.repository.update;

import com.huwng05.repository.curd.SelectRepository;
import com.huwng05.repository.curd.UpdateRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class UpdateDecorator<T> extends UpdateRepository<T> {
    protected UpdateRepository<T> root;
    protected UpdateDecorator(UpdateRepository<T> root) throws SQLException {
        this.root = root;
    }
}
