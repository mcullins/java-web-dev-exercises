package org.launchcode.java.stuidos.countingchars;

import exercises.chap3.Array;

import java.util.Arrays;
import java.util.List;

public class StoreQty {
    public static Integer storeQty(char[] charArray, Integer char2count){
        Integer count = 0;
        if(Arrays.asList(charArray).contains(char2count)){
            count++;
        }
        return count;
    }
}
