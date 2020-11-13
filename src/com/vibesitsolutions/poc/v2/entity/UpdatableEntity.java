package com.vibesitsolutions.poc.v2.entity;

/**
 * @author Victor Martin
 */
public interface UpdatableEntity<R extends Reader, U extends Updater> extends ReadableEntity<R> {

    U updater();

}
