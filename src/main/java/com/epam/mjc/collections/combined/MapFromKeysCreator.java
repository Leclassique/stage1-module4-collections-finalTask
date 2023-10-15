package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultSet = new HashMap<>();
        for (String key : sourceMap.keySet()){
            int length = key.length();
            Set<String> strings = new HashSet<>();
            for (Map.Entry<String, Integer> entry : sourceMap.entrySet()){
                if (length == entry.getKey().length()){
                    strings.add(entry.getKey());
                }
            }
            resultSet.put(length, strings);
        }
        return resultSet;
    }
}