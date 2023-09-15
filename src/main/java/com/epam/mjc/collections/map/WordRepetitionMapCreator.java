package com.epam.mjc.collections.map;

import java.util.*;


public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> myMap = new HashMap<>();
        if (sentence.length() <= 1) {
            return myMap;
        }
        sentence = sentence.toLowerCase().replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "");
        List<String> mySet = new ArrayList<>(List.of(sentence.split(" ")));

        for (var c : mySet
        ) {
            myMap.put(c, countMatches(sentence, c));
        }

        return myMap;
    }

    private static int countMatches(String text, String str) {
        return text.split(str, -1).length - 1;
    }
}
