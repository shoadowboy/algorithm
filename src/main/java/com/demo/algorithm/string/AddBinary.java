package com.demo.algorithm.string;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carrier = 0;
        StringBuffer sb = new StringBuffer();
        while(i >= 0 || j >= 0) {
            int ia = i >= 0 ? a.charAt(i--) - '0' : 0;
            int ib = j >= 0 ? b.charAt(j--) - '0' : 0;
            int r = ia + ib + carrier;
            if(r >= 3) {
                carrier = 1;
                r = 1;
            } else if (r == 2) {
                r = 0;
                carrier = 1;
            } else {
                carrier = 0;
            }
            sb.insert(0, "" + r);
        }
        if(carrier == 1)
            sb.insert(0, "1");
        return sb.toString();
    }
}
