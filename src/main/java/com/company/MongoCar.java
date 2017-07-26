package com.company;

import org.bson.Document;
import org.bson.types.ObjectId;

/**
 * Created by RENT on 2017-07-26.
 */
public class MongoCar extends Car {
    private ObjectId id;
    public MongoCar(String model, String manufacturer, String[] addons, String productionYear, int horsePower) {
        super(model, manufacturer, addons, productionYear, horsePower);
    }
    public Document toMongo(){
        Document d = new Document();
        d.put("model", this.getModel());
        d.put("producent", this.getManufacturer());


    }
}
