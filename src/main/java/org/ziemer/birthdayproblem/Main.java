package org.ziemer.birthdayproblem;

import edu.princeton.cs.algs4.StdRandom;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int experiments = 1_000_000;
        int total = 0;

        for (int i = 0; i < experiments; i++) {
            boolean[] randoms = new boolean[N];
            int counter = 0;

            while (true) {
                int rand = StdRandom.uniform(N - 1);
                if (randoms[rand]) {
                    break;
                }
                randoms[rand] = true;
                counter++;
            }
            total += counter;
        }

        System.out.println("Average case of "+ experiments + " experiments: " + (total * 1.0) / experiments);
    }
}
