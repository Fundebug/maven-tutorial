package com.fundebug;

import org.json.JSONObject;

public class Hello {
        public static void main(String[] args) {
                JSONObject tomJsonObj = new JSONObject();
                tomJsonObj.put("name", "Fundebug");
                tomJsonObj.put("url", "https://www.fundebug.com");
                System.out.println(tomJsonObj.toString(4));
        }
}