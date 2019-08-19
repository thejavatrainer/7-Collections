/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.chapterone.tostring;

public class EasyToReadContact {
    private final String name;
    private final String address;

    public EasyToReadContact(final String name, final String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EasyToReadContact{" + "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}