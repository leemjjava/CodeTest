package com.kipis.codetest;

import android.widget.Switch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//다트게임
public class Solution06 {
    public int solution(String dartResult) {
        char[] resultList = dartResult.toCharArray();

        int[] pointArray = new int[3];
        char[] optionArray = new char[3];

        int index = -1;
        boolean isNumber = false;

        for(char item : resultList){
            if(Character.isDigit(item)){
                if(isNumber == true){
                    pointArray[index] = 10;
                }else{
                    index++;
                    pointArray[index] = Integer.parseInt(""+item);
                }

                isNumber = true;
            }else{
                isNumber = false;
                int data = pointArray[index];

                switch (item){
                    case 'S':
                        pointArray[index] = (int)Math.pow(data,1);
                        break;
                    case 'D':
                        pointArray[index] = (int)Math.pow(data,2);
                        break;
                    case 'T':
                        pointArray[index] = (int)Math.pow(data,3);
                        break;
                    case '*':
                    case '#':
                        optionArray[index] = item;
                        break;
                    default:

                }
            }
        }
        

        for(int i  = 0; i < 3; ++i){
            char option = optionArray[i];

            if(option == '*' && i == 0){
                pointArray[i] = pointArray[i] * 2;
            }else if(option == '*' && i != 0){
                pointArray[i-1] = pointArray[i-1] * 2;
                pointArray[i] = pointArray[i] * 2;
            }else if(option == '#'){
                pointArray[i] = -pointArray[i];
            }
        }

        return pointArray[0] + pointArray[1] + pointArray[2];
    }
}
