package com.vibesitsolutions.poc.v2.entity;

/**
 * @author Victor Martin
 */
public abstract class AbstractUpdater<E extends Entity> implements Updater {

    protected E entity;

    protected AbstractUpdater(E entity) {
        this.entity = copy(entity);
    }

    protected abstract E copy(E entity);

    public E get() {
        return entity;
    }

}
