package com.sparta.sc;

public class Fibonacci {

    public static int findNumber(int position) {

        if (position == 0) {
            return 0;
        } else if (position == 1 || position == 2) {
            return 1;
        } else {
            return findNumber(position - 1) + findNumber(position - 2);
        }
    }

    public static int[] getSequence(int position) {

        int[] sequence = new int[position + 1];

        for (int i = 0; i <= position; i++) {
            sequence[i] = findNumber(i);
        }
        return sequence;
    }
}
