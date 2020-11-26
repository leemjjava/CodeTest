package com.kipis.codetest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Solution obj = new Solution();

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        assertEquals(4, obj.solution(board, moves));
    }

    @Test
    public void test_solution02() {
        Solution02 obj = new Solution02();

        int[] answers = {1,2,3,4,5};

        assertEquals(1, obj.solution(answers)[0]);

        int[] answers02 = {1,3,2,4,2};

        assertEquals(3, obj.solution(answers02)[2]);
    }

    @Test
    public void test_solution03() {
        Solution03 obj = new Solution03();

        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        assertEquals("#####", obj.solution(n,arr1,arr2)[0]);
    }

    @Test
    public void test_solution04() {
        Solution04 obj = new Solution04();

        int[] numbers = {2,1,3,4,1};

        assertEquals(4, obj.solution(numbers)[2]);
    }

    @Test
    public void test_solution06() {
        Solution06 obj = new Solution06();

        String result = "1S2D*3T";

        assertEquals(37, obj.solution(result));
    }
}