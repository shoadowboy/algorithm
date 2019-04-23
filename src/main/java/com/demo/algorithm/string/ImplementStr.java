package com.demo.algorithm.string;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class ImplementStr {

    public int strStr(String haystack, String needle) {
        if (haystack == null) {
            return -1;
        }
        if (null == needle || needle.length() == 0) {
            return 0;
        }

        // 模式匹配
        int index = 0;
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = needleArr.length + 1;
            ;
        }
        for (int i = 0; i < needle.length(); i++) {
            map[needle.charAt(i)] = needleArr.length - i;
        }
        int end = haystackArr.length - needleArr.length;
        while (index <= end) {
            int currentLength = 0;
            //判断是否完全匹配
            while (haystackArr[index + currentLength] == needleArr[currentLength]) {
                currentLength++;
                if (currentLength >= needleArr.length) {
                    return index;
                }
            }
            if (index+needleArr.length>=haystackArr.length){
                return -1;
            }
            index = index + map[haystackArr[index + needleArr.length]];
        }
        return -1;
    }

    public static void main(String[] args) {

        String str1 = "aaaaa";
        String str2 = "bba";
        int i = new ImplementStr().strStr(str1, str2);
        System.out.println(i);
    }
}
