package com.vibesitsolutions.poc.v2.repository;

import com.vibesitsolutions.poc.v2.entity.ReadableEntity;
import com.vibesitsolutions.poc.v2.entity.Reader;

/**
 * @author Victor Martin
 */
public interface Repository<R extends Reader, RE extends ReadableEntity<R>> {

    R insert(RE entity);

    R update(RE entity);

    R findBy(String id);

}
