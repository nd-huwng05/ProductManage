package com.huwng05.services;

import com.huwng05.pojo.Category;
import com.huwng05.repository.curd.SelectRepository;
import com.huwng05.repository.select.SelectCategoryRepo;

import java.sql.SQLException;
import java.util.List;

public class CategoryServices {
    public List<Category> list() throws SQLException {
        SelectRepository<Category> repo = new SelectCategoryRepo();
        return repo.list();
    }

}
