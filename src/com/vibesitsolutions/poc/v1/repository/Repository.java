package com.vibesitsolutions.poc.v1.repository;

import com.vibesitsolutions.poc.v1.entity.Entity;
import com.vibesitsolutions.poc.v1.entity.Reader;

/**
 * @author Victor Martin
 */
public interface Repository<T extends Entity, R extends Reader> {

    R insert(T entity);

    R update(T entity);

    R findBy(String id);

}
