package com.vibesitsolutions.poc.v2.repository;

import com.vibesitsolutions.poc.v2.entity.impl.OneEntity;

/**
 * @author Victor Martin
 */
public class OneRepository extends AbstractRepo<OneEntity, OneEntity.EntityReader> {

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
