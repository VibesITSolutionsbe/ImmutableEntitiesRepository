package com.vibesitsolutions.poc.v2.entity;

/**
 * @author Victor Martin
 */
public interface ReadableEntity<R extends Reader> extends Entity {

    R reader();

}
