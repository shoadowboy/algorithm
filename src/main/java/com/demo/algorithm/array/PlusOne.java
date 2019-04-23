package com.demo.algorithm.array;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int add = 0;
        for (int i=digits.length-1;i>=0;i--){

            int current = digits[i] + add;
            if (i==digits.length-1){
                current +=1;
            }
            if (current>=10){
                digits[i] =0;
                add=1;
            }else {
                digits [i]  =current;
                add=0;
            }
        }
        //全9999这种 要新数组进1
        if (add==1){
            int[] ints = new int[digits.length + 1];
            ints[0]  = 1;
            for (int i=1;i<ints.length;i++){
                ints[i] = digits[i-1];
            }
            return ints;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digist ={9};
        int[] ints = new PlusOne().plusOne(digist);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
