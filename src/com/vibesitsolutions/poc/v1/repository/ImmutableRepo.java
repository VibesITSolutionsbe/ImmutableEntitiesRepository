package com.vibesitsolutions.poc.v1.repository;

import com.vibesitsolutions.poc.v1.entity.impl.Immutable;

/**
 * @author Victor Martin
 */
public class ImmutableRepo implements Repository<Immutable, Immutable> {
    @Override
    public Immutable insert(Immutable entity) {
        return entity;
    }

    @Override
    public Immutable update(Immutable entity) {
        return entity;
    }

    @Override
    public Immutable findBy(String id) {
        return null;
    }
}
