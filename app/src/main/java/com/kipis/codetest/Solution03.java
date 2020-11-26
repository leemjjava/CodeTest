package com.kipis.codetest;

//비밀지도
public class Solution03 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0 ; i < n; ++i){
            char[] binaryArray = Integer.toBinaryString(arr1[i]).toCharArray();
            char[] binaryArray02 = Integer.toBinaryString(arr2[i]).toCharArray();

            String row = getRow(binaryArray,binaryArray02, n);

            System.out.println(row);
            answer[i] = row;
        }

        return answer;
    }

    String getRow(char[] binaryArray, char[] binaryArray02, int n){
        String data = "";
        for(int i = 1 ; i <= n ; ++i){
            int index01 = binaryArray.length - i;
            int index02 = binaryArray02.length - i;

            char c01 = index01 >= 0 ? binaryArray[index01] : '0';
            char c02 = index02 >= 0 ? binaryArray02[index02] : '0';

            if(c01 == '1' || c02 == '1'){
                data = "#"+data;
            }else{
                data = " "+data;
            }
        }

        return data;
    }
}
