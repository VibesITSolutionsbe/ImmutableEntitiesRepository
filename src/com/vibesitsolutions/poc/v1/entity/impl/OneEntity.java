package com.vibesitsolutions.poc.v1.entity.impl;

import com.vibesitsolutions.poc.v1.entity.ReadableEntity;
import com.vibesitsolutions.poc.v1.entity.Reader;
import com.vibesitsolutions.poc.v1.entity.UpdatableEntity;
import com.vibesitsolutions.poc.v1.entity.Updater;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * @author Victor Martin
 */
public class OneEntity implements ReadableEntity<OneEntity.EntityReader> {
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

    @Override
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
    public EntityReader reader() {

        return new EntityReader(this);
    }

    public static class EntityReader implements Reader, UpdatableEntity<EntityUpdater> {

        private final OneEntity oneEntity;

        public EntityReader(OneEntity OneEntity) {
            this.oneEntity = OneEntity;
        }

        public String getId() {
            return oneEntity.getId();
        }

        public String getProp1() {
            return oneEntity.getProp1();
        }

        public String getProp2() {
            return oneEntity.getProp2();
        }

        public Date getDate() {
            return new Date(oneEntity.getDate().getTime());
        }

        @Override
        public EntityUpdater updatable() {
            return new EntityUpdater(oneEntity);
        }
    }

    public static class EntityUpdater implements Updater {

        private final OneEntity oneEntity;

        // Create a copy of each properties if needed the object to keep the internal state of the original one
        protected EntityUpdater(OneEntity oneEntity) {
            this.oneEntity = new OneEntity(
                    oneEntity.getId(),
                    oneEntity.getProp1(),
                    oneEntity.getProp2(),
                    new Date(oneEntity.getDate().getTime()),
                    Collections.unmodifiableMap(oneEntity.getMap()));
        }

        public EntityUpdater withProp1(String prop1) {
            oneEntity.setProp1(prop1);
            return this;
        }

        public EntityUpdater withProp2(String prop2) {
            oneEntity.setProp2(prop2);
            return this;
        }

        public EntityUpdater withDate(Date date) {
            oneEntity.setDate(date);
            return this;
        }

        public OneEntity get() {
            return oneEntity;
        }

    }
}
