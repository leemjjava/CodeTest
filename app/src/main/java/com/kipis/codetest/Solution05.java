package com.kipis.codetest;

import java.util.ArrayList;
import java.util.HashMap;

//완주하지 못한 선수
public class Solution05 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap();
        ArrayList<String> overlapList = new ArrayList<>();

        for(String cItem : completion){
            Integer item = map.get(cItem);
            int input = item == null ? 1 : ++item;

            map.put(cItem,input);
        }

        for(String pItem: participant){
            Integer item = map.get(pItem);
            if(item == null) return pItem;

            map.put(pItem, ++item);
            if(item > 2) overlapList.add(pItem);
        }

        for(String key : overlapList){
            Integer cInt = map.get(key);
            if(cInt % 2 != 0) return key;
        }

        return "";
    }
}
