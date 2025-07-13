package com.huwng05.repository.select;

import com.huwng05.pojo.Product;
import com.huwng05.repository.curd.SelectRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class SelectDecorator<T> extends SelectRepository<T> {

    protected SelectRepository<T> root;
    protected SelectDecorator(SelectRepository<T> root) throws SQLException {
        this.root = root;
    }

    public List<T> getResult(ResultSet rs) throws SQLException {
        return this.root.getResult(rs);
    }
}
