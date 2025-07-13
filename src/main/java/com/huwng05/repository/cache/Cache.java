package com.huwng05.repository.cache;

import com.huwng05.repository.curd.SelectRepository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {
    public static Map<String, List> cached = new HashMap<>();

    public static <E> List<E> getData(SelectRepository r, String key) throws SQLException {
        if (cached.containsKey(key)) return cached.get(key);
        List<E> object = r.list();
        cached.put(key, object);
        return object;
    }
}
