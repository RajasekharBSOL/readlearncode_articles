package com.readlearncode;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SimpleObjectModelExample {

    private String json =
            "{\"id\": 123456, \"title\": \"Fun with JSON-Processing\", \"published\": true}";

    /**
     * Builds a JsonObject from a Stirng of JSON data.
     *
     * @return a JsonObject built from a String of JSON data
     */
    public JsonObject loadJsonString() {

        JsonReader jsonReader = Json.createReader(new StringReader(json));
        JsonObject jsonObject = jsonReader.readObject();
        jsonReader.close();

        return jsonObject;
    }
}