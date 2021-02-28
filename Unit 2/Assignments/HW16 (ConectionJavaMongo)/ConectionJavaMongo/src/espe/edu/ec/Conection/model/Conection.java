/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.Conection.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import espe.edu.ec.Conection.view.SystemMongo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Conection {
    DB BaseData;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public Conection(){
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            BaseData = mongo.getDB("Virtual_Id");
            collection = BaseData.getCollection("Id");
        }catch(Exception ex){
            Logger.getLogger(SystemMongo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public boolean create(String accion){
            document.put("id", accion);
            collection.insert(document);
            return true;
        }
        
        
        public void read(){
            DBCursor cursor = collection.find();
            while(cursor.hasNext()){
                System.out.println(cursor.next());
            }
        }
        
        public boolean update(String actionOld, String actionNew){
            document.put("id",actionOld);
            BasicDBObject fileNew = new BasicDBObject();
            fileNew.put("id",actionNew);
            collection.findAndModify(document, fileNew);
            return true;
        }
        
        public boolean delete(String action){
            document.put("id", action);
            collection.remove(document);
            return true;
        }
}
