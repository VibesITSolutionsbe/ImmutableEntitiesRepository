package com.vibesitsolutions.poc.v2.entity.impl;

import com.vibesitsolutions.poc.v2.entity.AbstractUpdatableReader;
import com.vibesitsolutions.poc.v2.entity.AbstractUpdater;
import com.vibesitsolutions.poc.v2.entity.UpdatableEntity;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * @author Victor Martin
 */
public class OneEntity implements UpdatableEntity<OneEntity.EntityReader, OneEntity.EntityUpdater> {
    private String id;
    private String prop1;
    private String prop2;
    private Date date;
    private Map<String, Object> map;

    public OneEntity(
            String id,
            String prop1,
            String prop2,
            Date date, Map<String, Object> map) {
        this.id = id;
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.date = date;
        this.map = map;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getProp1() {
        return prop1;
    }

    protected void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    protected void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public Date getDate() {
        return date;
    }

    protected void setDate(Date date) {
        this.date = date != null ? new Date(date.getTime()) : null;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = Collections.unmodifiableMap(map);
    }

    @Override
    public OneEntity.EntityReader reader() {
        return new EntityReader(this);
    }

    @Override
    public EntityUpdater updater() {
        return new EntityUpdater(this);
    }

    public static class EntityReader extends AbstractUpdatableReader<OneEntity, EntityReader, EntityUpdater> {

        public EntityReader(OneEntity entity) {
            super(entity);
        }

        public String getId() {
            return entity.getId();
        }

        public String getProp1() {
            return entity.getProp1();
        }

        public String getProp2() {
            return entity.getProp2();
        }

        public Date getDate() {
            return new Date(entity.getDate().getTime());
        }
    }

    public static class EntityUpdater extends AbstractUpdater<OneEntity> {

        protected EntityUpdater(OneEntity entity) {
            super(entity);
        }

        @Override
        protected OneEntity copy(OneEntity entity) {
            return new OneEntity(
                    entity.getId(),
                    entity.getProp1(),
                    entity.getProp2(),
                    new Date(entity.getDate().getTime()),
                    Collections.unmodifiableMap(entity.getMap()));
        }

        public EntityUpdater withProp1(String prop1) {
            entity.setProp1(prop1);
            return this;
        }

        public EntityUpdater withProp2(String prop2) {
            entity.setProp2(prop2);
            return this;
        }

        public EntityUpdater withDate(Date date) {
            entity.setDate(date);
            return this;
        }

    }
}
