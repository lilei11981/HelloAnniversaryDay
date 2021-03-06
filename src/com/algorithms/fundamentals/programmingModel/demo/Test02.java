package com.algorithms.fundamentals.programmingModel.demo;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by lilei on 2017/9/18 下午2:12.
 */
public class Test02 {
    public static void main(String[] args) {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i < N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }
}
