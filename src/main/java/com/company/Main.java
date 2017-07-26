package com.company;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.*;
import com.mongodb.client.model.CreateCollectionOptions;
import org.bson.BsonArray;
import org.bson.BsonDouble;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient();
        List<String> names = mongoClient.getDatabaseNames();

        names.forEach((name)->{

            System.out.println(name);
        });

        MongoDatabase test = mongoClient.getDatabase("test");
        MongoIterable<String> collectionNames = test.listCollectionNames();

       collectionNames.forEach((Block<? super String>) (String name)->{
           System.out.println(name);
       });


       MongoCollection<Document> p = test.getCollection("auta");
       //Document auto = new Document().append("")

//        BsonArray a = new BsonArray();
//        a.add(new BsonDouble(12.0));
//        a.add(new BsonDouble(43.0));
//        a.add(new BsonDouble(23.0));
//        a.add(new BsonDouble(33.0));
//        a.add(new BsonDouble(73.0));
//
//       Document doc = new Document()
//               .append("name", "Test")
//               .append("surname", "Testowy")
//               .append("numbers", a );
//
//       p.insertOne(doc);

//        FindIterable<Document> documents = p.find(new BasicDBObject().append("_id",
//                new ObjectId("5978daa45999041814454f8d")));
//        documents.forEach((Block<? super Document>) (Document doc)->{
//            doc.replace("name", "Test2");
//            p.replaceOne(new BasicDBObject().append("_id", new ObjectId("5978daa45999041814454f8d")),doc);
//        });
       p.find().forEach((Block<? super Document>) (Document d) -> {
           System.out.println("Document:");
           d.entrySet().forEach((entry)->{
               System.out.println(entry.getKey() + ": " + entry.getValue().toString());
           });
       });

    }
}
