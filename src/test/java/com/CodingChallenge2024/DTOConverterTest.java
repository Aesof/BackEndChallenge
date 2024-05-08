package com.CodingChallenge2024;

import java.util.*;

public class DTOConverterTest {
    public static LinkedHashMap<String, Integer> sortalphValue(HashMap<String, Integer> inputMap) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(inputMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                if(o1 == null || o2 == null){
                    throw new IllegalArgumentException("null");
                }

                int valueComp = o2.getValue().compareTo(o1.getValue());

                if(valueComp != 0){
                    return valueComp;
                }

                return o1.getKey().compareTo(o2.getKey());
            }
        });


        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;

    }


    public static HashMap<String, Integer> filterContent(String content) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        String[] words = content.split(" ");
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        String[] noDupl = wordSet.toArray(new String[wordSet.size()]);
        for (String string : noDupl) {
            int countDupl = 0;

            for(String word : words) {
                if (string.equals(word)) {
                    countDupl++;

                }


            }
            wordMap.put(string, countDupl);

        }
        return sortalphValue(wordMap);

    }

    public static void main(String[] args) {
        String input1 = "hello hi hello hi hallo halihalo was geht ab what up";
        System.out.println(filterContent(input1));
    }
}
