package com.Practice;

import java.util.*;

public class three {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(3);
        list.add(9);

        System.out.println(list);
        System.out.println(list.size());
        list.set(1,1);
        System.out.println(list);
        for(int i = 0;i<5;i++){
            for(int j = 1;j<5-i;j++){
                if(list.get(j) < list.get(j-1)){
                    int temp = list.get(j-1);
                    list.set(j-1,list.get(j));
                    list.set(j,temp);
                }
            }
        }

        System.out.println(list);
        list.add(1,6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("Android", "Mobile");
        map.put("Eclipse IDE", "Java");
        map.put("Eclipse RCP", "Java");
        map.put("Git", "Version control system");

        map.remove("Git");
        System.out.println(map);

        List<String> key = new ArrayList<>(map.keySet());
        System.out.println(key);
        System.out.println(map.containsKey("Eclipse IDE"));
        System.out.println(map.containsValue("Mobile"));


    }


}
