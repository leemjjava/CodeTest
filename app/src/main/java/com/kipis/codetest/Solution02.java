package com.kipis.codetest;

//모의고사
public class Solution02 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] oneArray = {1,2,3,4,5};
        int[] twoArray = {2,1,2,3,2,4,2,5};
        int[] threeArray = {3,3,1,1,2,2,4,4,5,5};

        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;

        for(int i =0 ; i < answers.length; ++i){
            int realAnswer = answers[i];

            int oneAnswer = oneArray[i % oneArray.length];
            int twoAnswer = twoArray[i % twoArray.length];
            int threeAnswer = threeArray[i % threeArray.length];

            if(realAnswer == oneAnswer) ++oneCount;
            if(realAnswer == twoAnswer) ++twoCount;
            if(realAnswer == threeAnswer) ++threeCount;
        }

        if(oneCount == twoCount && oneCount == threeCount) return new int[]{1,2,3};

        if(oneCount > twoCount && oneCount > threeCount) return new int[]{1};
        if(twoCount > oneCount && twoCount > threeCount) return new int[]{2};
        if(threeCount > oneCount && threeCount > twoCount) return new int[]{3};

        if(oneCount == twoCount) return new int[]{1,2};
        if(oneCount == threeCount) return new int[]{1,3};
        if(twoCount == threeCount) return new int[]{2,3};

        return answer;
    }
}
