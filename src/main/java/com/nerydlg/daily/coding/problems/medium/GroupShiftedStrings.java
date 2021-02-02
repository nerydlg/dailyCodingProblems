package com.nerydlg.daily.coding.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftedStrings {
    private Map<String, List<String>> map = new HashMap<>();
    private static final int ALPHA = 26;

    public List<List<String>> groupStrings(String[] strings) {
        for(int i =0; i< strings.length; i++) {
            String s = strings[i];
            String key = generateKeyFrom(s);
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(s);
                map.put(key,list);
            } else {
                ArrayList<String> v = new ArrayList<>();
                v.add(s);
                map.put(key, v);
            }
        }
        return new ArrayList<>(map.values());
    }

    private String generateKeyFrom(String s) {
        int diff = 0;
        StringBuilder key = new StringBuilder();
        int n = s.length();
        for(int i = 1; i < n; i++) {
            diff = s.charAt(i) - s.charAt(i-1);

            if(diff < 0) {
                diff += ALPHA;
            }
            key.append(diff);
        }
        return key.toString();
    }


    public static void main(String[] args ) {
        GroupShiftedStrings a = new GroupShiftedStrings();
        a.groupStrings(new String[]{"abc","bcd","acef","xyz","az","ba","a","z"})
                .stream()
                .forEach(list -> list.stream().forEach(System.out::println));
    }

}
