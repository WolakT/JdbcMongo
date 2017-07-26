package com.company;

import org.bson.types.ObjectId;

/**
 * Created by RENT on 2017-07-26.
 */
public class MongoCar extends Car {
    private ObjectId id;
    public MongoCar(String model, String manufacturer, String[] addons, String productionYear, int horsePower) {
        super(model, manufacturer, addons, productionYear, horsePower);
    }
}
