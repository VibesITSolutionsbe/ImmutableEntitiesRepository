package com.vibesitsolutions.poc.v1.entity;

/**
 * @author Victor Martin
 */
public interface UpdatableEntity<U extends Updater> {

    U updatable();
}
