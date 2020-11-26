package com.kipis.codetest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//두 개 뽑아서 더하기
public class Solution04 {
    public int[] solution(int[] numbers) {

        HashMap<Integer,String> map = new HashMap();

        for(int i = 0 ; i < numbers.length; ++i){
            int number = numbers[i];

            for(int j = 0 ; j < numbers.length; ++j){
                if(j == i) continue;
                int plusNumber = numbers[j];

                map.put(number+plusNumber, "값");
            }
        }

        int[] answer = new int[map.size()];

        Set set = map.keySet();
        Iterator iterator = set.iterator();

        int count = 0;
        while(iterator.hasNext()){
            Integer key = (Integer)iterator.next();
            answer[count] = key;
            ++count;
        }

        Arrays.sort(answer);
        return answer;
    }
}
