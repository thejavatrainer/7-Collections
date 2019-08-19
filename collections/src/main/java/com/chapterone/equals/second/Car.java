/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.chapterone.equals.second;

import java.time.Year;
import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private Year year;
    private String vin;

    public Car(final String make, final String model, final Year year, final String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Year getYear() {
        return year;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public boolean equals(final Object o) {
        boolean isEqual;

        if (this == o) {
            isEqual = true;
        } else if (o == null || getClass() != o.getClass()) {
            isEqual = false;
        } else {
            Car car = (Car) o;
            isEqual = Objects.equals(make, car.make)
                    && Objects.equals(model, car.model)
                    && Objects.equals(year, car.year)
                    && Objects.equals(vin, car.vin);
        }

        return isEqual;
    }

    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year + '\'' +
                ", vin='" + vin +
                '}';
    }
}
