package com.algorithms.fundamentals.programmingModel.basic;


import com.algorithms.fundamentals.programmingModel.basic.test.In;
import com.algorithms.fundamentals.programmingModel.basic.test.StdIn;
import com.algorithms.fundamentals.programmingModel.basic.test.StdOut;

import java.util.Arrays;

/**
 * Created by lilei on 2017/9/17 上午9:46.
 */
public class BinarySearch {
    public static int rank(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < array[middle]) {
                high = middle - 1;
            } else if (key > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try {
            //  过滤掉白名单中的数
            int[] whitelist = In.readInts(args[0]);
            Arrays.sort(whitelist);
            while (!StdIn.isEmpty()) {
                int key = StdIn.readInt();
                if (rank(key, whitelist) == -1) {
                    StdOut.println(key);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
