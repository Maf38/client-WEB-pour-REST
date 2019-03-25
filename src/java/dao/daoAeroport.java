/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;





import com.google.gson.Gson;

import dto.Aeroport;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;
import javax.json.JsonValue;

import jdk.nashorn.api.scripting.URLReader;


/**
 *
 * @author gai
 */
public class daoAeroport {

    private static Gson gson = new Gson();

    public static List<Aeroport> getAeroports() {
        List<Aeroport> list;
        try {
            URL url = new URL("http://localhost:8080/serviceREST/webresources/entite.aeroport");
            Reader reader = new URLReader(url);
            list = new ArrayList<>();
            JsonReader jsonReader = (JsonReader) Json.createReader(reader);
//on demande au reader d'extraire un tableau json
            JsonArray arr;
            arr = jsonReader.readArray();
            for (JsonValue o : arr) {
// pour chaque élément du tableau, qui est un JsonObject,
// on utilise Gson pour en faire un objet métier
                Aeroport co = gson.fromJson(o.toString(), Aeroport.class);
                list.add(co);
            }
        } catch (Exception e) {
            System.out.println("Exception client : " + e.getMessage());
            list = null;
        }
        return list;

    }
}
