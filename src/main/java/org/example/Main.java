package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Map<String, String> mapString = new HashMap<>();
//        mapString.put("key1", "value1");
//        mapString.put("key2", "value2");
//        mapString.put("key3", "value3");
//        mapString.put("key1", "value3");
//
//        System.out.println(mapString);
//        for (String s: mapString.keySet()){
//            System.out.println(s);
//        }
//        mapString.forEach((key,value) -> System.out.println( key + "value=" + value));

        ArrayList<String> stringOfWords = new ArrayList<>();
        stringOfWords.add("Hvad");
        stringOfWords.add("Seneste nyt");
        stringOfWords.add("Nyheder");
        stringOfWords.add("<div>");
        UrlReader url = new UrlReader();

        ArrayList<String> urls = new ArrayList<>();
        urls.add("https://www.dr.dk");
        urls.add("https://www.ekstrabladet.dk");
        urls.add("https://www.bt.dk");

        Map<String, Map<String, Integer>> mappedUrls = url.mapUrls(urls,stringOfWords);
        System.out.println(mappedUrls);


    }
}