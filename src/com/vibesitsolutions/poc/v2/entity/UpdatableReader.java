package com.vibesitsolutions.poc.v2.entity;

/**
 * @author Victor Martin
 */
public interface UpdatableReader<U extends Updater> extends Reader {

    U updater();

}
