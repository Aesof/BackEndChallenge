package com.CodingChallenge2024;

import java.sql.Array;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.HashMap;

public class DTOConverter {

    public static LinkedHashMap<String, Integer> sortalphValue(HashMap<String, Integer> inputMap) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(inputMap.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1 == null || o2 == null) {
                    throw new IllegalArgumentException("null");
                }
                int valueComp = o1.getValue().compareTo(o2.getValue());
                if (valueComp != 0) {
                    return valueComp;
                }
                //wenn value gleich: dann nach key sortieren

                return o1.getKey().compareTo(o2.getKey());
            }
        });

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    ;

    public static LinkedHashMap<String, Integer> filterContent(SubmissionDTO submission) {

        HashMap<String, Integer> wordMap = new HashMap<>();
        String[] words = submission.getContent().split(" ");
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        String[] noDupl = wordSet.toArray(new String[wordSet.size()]);
        for (int i = 0; i < noDupl.length; i++) {
            int initialValue = 0;
            for (int j = 0; j < words.length; j++) {

                if (noDupl[i].equals(words[j])) {
                    initialValue++;
                    wordMap.put(noDupl[i], initialValue);

                }

            }
        }

        return sortalphValue(wordMap);

    }
}
//insertion order: how to map linked hash map to hibernate jpa persistence map? research

