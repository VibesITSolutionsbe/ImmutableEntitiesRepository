package com.vibesitsolutions.poc.v1.entity.impl;

import com.vibesitsolutions.poc.v1.entity.ReadableEntity;
import com.vibesitsolutions.poc.v1.entity.Reader;

/**
 * @author Victor Martin
 */
public class Immutable implements Reader, ReadableEntity<Immutable> {

    private final String a;
    private final String b;
    private final String c;

    public Immutable(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Immutable reader() {
        return this;
    }

    @Override
    public String getId() {
        return null;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }
}
