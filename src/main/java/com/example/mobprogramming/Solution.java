package com.example.mobprogramming;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws Exception {
        File file = new File(ClassLoader.getSystemResource("data.txt").getFile());

        List<String> contents = Files.readAllLines(file.toPath());

        List<Integer> result = new ArrayList<>();

        if (contents.get(0).length() == 26) {
            contents.set(0, contents.get(0).concat(" "));
        }
        for (int i = 0; i < contents.get(0).length(); i = i + 3) {
            char[][] tmp = new char[3][3];
            tmp[0][0] = contents.get(0).charAt(i);
            tmp[0][1] = contents.get(0).charAt(i+1);
            tmp[0][2] = contents.get(0).charAt(i+2);

            tmp[1][0] = contents.get(1).charAt(i);
            tmp[1][1] = contents.get(1).charAt(i+1);
            tmp[1][2] = contents.get(1).charAt(i+2);

            tmp[2][0] = contents.get(2).charAt(i);
            tmp[2][1] = contents.get(2).charAt(i+1);
            tmp[2][2] = contents.get(2).charAt(i+2);

            result.add(parse(tmp));
        }

        System.out.println(result);
        System.out.println("Sum is: " + result.stream().mapToInt(Integer::intValue).sum());
    }

    private static Integer parse(char[][] tmp) {
        if (Arrays.deepEquals(tmp, Digits.ZERO)) {
            return 0;
        }
        if (Arrays.deepEquals(tmp, Digits.ONE)) {
            return 1;
        }
        if (Arrays.deepEquals(tmp, Digits.TWO)) {
            return 2;
        }
        if (Arrays.deepEquals(tmp, Digits.THREE)) {
            return 3;
        }
        if (Arrays.deepEquals(tmp, Digits.FOUR)) {
            return 4;
        }
        if (Arrays.deepEquals(tmp, Digits.FIVE)) {
            return 5;
        }
        if (Arrays.deepEquals(tmp, Digits.SIX)) {
            return 6;
        }
        if (Arrays.deepEquals(tmp, Digits.SEVEN)) {
            return 7;
        }
        if (Arrays.deepEquals(tmp, Digits.EIGHT)) {
            return 8;
        } else {
            return 9;
        }
    }
}

class Digits {

    final static char[][] ZERO = new char[][] {
            {' ','_',' '},
            {'|',' ','|'},
            {'|','_','|'}
    };

    final static char[][] ONE = new char[][] {
            {' ',' ',' '},
            {' ',' ','|'},
            {' ',' ','|'},
    };

    final static char[][] TWO = new char[][] {
            {' ','_',' '},
            {' ','_','|'},
            {'|','_',' '},
    };

    final static char[][] THREE = new char[][] {
            {' ','_',' '},
            {' ','_','|'},
            {' ','_','|'},
    };

    final static char[][] FOUR = new char[][] {
            {' ',' ',' '},
            {'|','_','|'},
            {' ',' ','|'},
    };

    final static char[][] FIVE = new char[][] {
            {' ','_',' '},
            {'|','_',' '},
            {' ','_','|'},
    };

    final static char[][] SIX = new char[][] {
            {' ','_',' '},
            {'|','_',' '},
            {'|','_','|'},
    };

    final static char[][] SEVEN = new char[][] {
            {' ','_',' '},
            {' ',' ','|'},
            {' ',' ','|'},
    };

    final static char[][] EIGHT = new char[][] {
            {' ','_',' '},
            {'|','_','|'},
            {'|','_','|'},
    };

    final static char[][] NINE = new char[][] {
            {' ','_',' '},
            {'|','_','|'},
            {' ','_','|'},
    };
}

