package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();


        for (var ObjectSourceMap : sourceMap.entrySet()
        ) {
            String valueSourceMap = ObjectSourceMap.getValue();
            if (result.get(valueSourceMap) == null) {
                result.put(valueSourceMap, ObjectSourceMap.getKey());
            } else {

                Integer currentValueInResult = result.get(valueSourceMap);

                if (currentValueInResult > ObjectSourceMap.getKey()) {
                    result.put(valueSourceMap, ObjectSourceMap.getKey());
                }
            }
        }
        return result;
    }

}