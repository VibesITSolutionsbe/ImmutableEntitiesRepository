package com.vibesitsolutions.poc.v2.repository;

import com.vibesitsolutions.poc.v2.entity.ReadableEntity;
import com.vibesitsolutions.poc.v2.entity.Reader;

/**
 * @author Victor Martin
 */
public class AbstractRepo<RE extends ReadableEntity<R>, R extends Reader> implements Repository<R, RE> {

    @Override
    public R insert(RE entity) {
        System.out.println("insert");
        return entity.reader();
    }

    @Override
    public R update(RE entity) {
        System.out.println("update");
        return entity.reader();
    }

    @Override
    public R findBy(String id) {
        return null;
    }
}
