package com.vibesitsolutions.poc.v1.repository;

import com.vibesitsolutions.poc.v1.entity.impl.OneEntity;

/**
 * @author Victor Martin
 */
public class OneRepository implements Repository<OneEntity, OneEntity.EntityReader> {

    @Override
    public OneEntity.EntityReader insert(OneEntity entity) {
        return entity.reader();
    }

    @Override
    public OneEntity.EntityReader update(OneEntity entity) {
        return entity.reader();
    }

    @Override
    public OneEntity.EntityReader findBy(String id) {
        return null;
    }
}
