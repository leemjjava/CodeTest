package com.kipis.codetest;

import java.util.ArrayList;

//크레인 인형뽑기
public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        ArrayList<Integer> resultArray = new ArrayList();

        for(int now : moves){
            int dataPosition = now - 1;

            for(int[] row : board){
                int data = row[dataPosition];
                if(data == 0) continue;

                resultArray.add(data);

                if(resultArray.size() > 1){
                    int count = resultArray.size() - 1;
                    int nowData = resultArray.get(count);
                    int checkData = resultArray.get(count -1);

                    if(nowData == checkData){
                        answer = answer + 2;
                        resultArray.remove(count);
                        resultArray.remove(count -1);
                    }

                }
                row[dataPosition] = 0;
                break;
            }
        }

        return answer;
    }


}
