package com.demo.algorithm.dynamicprogramming;

/**
 * 最初在一个记事本上只有一个字符 'A'。你每次可以对这个记事本进行两种操作：
 * <p>
 * Copy All (复制全部) : 你可以复制这个记事本中的所有字符(部分的复制是不允许的)。
 * Paste (粘贴) : 你可以粘贴你上一次复制的字符。
 * 给定一个数字 n 。你需要使用最少的操作次数，在记事本中打印出恰好 n 个 'A'。输出能够打印出 n 个 'A' 的最少操作次数。
 */
public class Only2KeysKeyboard {
    public int minSteps(int n) {
        int[] step = new int[n + 1];
        step[1] = 0;
        for (int i = 2; i <= n; i++) {
            step[i] = Integer.MAX_VALUE;
            if (n % i == 0) {
                for (int j = 1; j * j <= n; j++) {
                    if (i % j == 0) {
                        step[i] = Math.min(step[i], step[j] + i / j);
                        if (i > 1) {
                            step[i] = Math.min(step[i], step[i / j] + j);

                        }
                    }
                }
            }
        }
        return step[n];
    }

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            int result = new Only2KeysKeyboard().minSteps(i);
            System.out.println(result);
        }
    }
}
