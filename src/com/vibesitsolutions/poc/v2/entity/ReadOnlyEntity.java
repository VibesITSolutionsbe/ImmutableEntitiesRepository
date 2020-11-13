package com.vibesitsolutions.poc.v2.entity;

/**
 * @author Victor Martin
 */
public interface ReadOnlyEntity<SELF extends Reader> extends ReadableEntity<SELF>, Reader {
}
