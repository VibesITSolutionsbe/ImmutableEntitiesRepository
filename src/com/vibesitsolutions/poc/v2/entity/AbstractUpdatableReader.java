package com.vibesitsolutions.poc.v2.entity;

/**
 * @author Victor Martin
 */
public abstract class AbstractUpdatableReader<E extends UpdatableEntity<R, U>, R extends Reader, U extends Updater> implements UpdatableReader<U> {

    protected E entity;

    public AbstractUpdatableReader(E entity) {
        this.entity = entity;
    }

    public U updater() {
        return entity.updater();
    }

}
