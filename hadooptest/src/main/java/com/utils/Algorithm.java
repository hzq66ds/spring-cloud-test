package com.utils;

import java.util.Random;

/**
 * 排序算法
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/8/23.
 * @author HZQ-PC
 */
public class Algorithm {

    /**
     * 冒泡排序
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array){
        if (array == null || array.length == 0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            //每次都会将最大值排到倒数第i位
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    swapNums(array, j ,j +1);
                }
            }
        }
        return array;
    }


    /**
     * 选择排序
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array){
        if (array == null || array.length == 0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            //筛选最小数的index
            int minindex = i;
            for (int j = i + 1; j < array.length; j++) {
                //使用最小数与当前数比较
                if(array[j] < array[minindex]){
                    minindex = j;
                }
            }
            if (minindex > i){
                swapNums(array, i ,minindex);
            }
        }
        return array;
    }

    /**
     * 插入排序
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array){
        if (array == null || array.length == 0){
            return array;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    swapNums(array, j, j-1);
                }else {
                    break;
                }
            }
        }
        return array;
    }

    /**
     * 希尔排序
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array){
        if (array == null || array.length == 0){
            return array;
        }
        for (int i = array.length>>1; i > 0 ; i = i>>1) {
            for (int j = 0; j + i < array.length; j++) {
                for (int k = j+i; k < array.length; k += i) {
                    if (array[j] > array[k]){
                        swapNums(array, k, j);
                    }
                }
            }
        }
        return array;
    }


    /**
     * 交换数据
     * @param nums
     * @param index1
     * @param index2
     */
    private static void swapNums(int[] nums, int index1, int index2){
        if (index1 != index2 || index1 < 0 || index2 < 0 || index1 >= nums.length || index2 >= nums.length){
            nums[index1] = nums[index1] + nums[index2];
            nums[index2] = nums[index1] - nums[index2];
            nums[index1] = nums[index1] - nums[index2];
        }
    }

    /**
     * 打印数组
     * @param nums
     */
    public static void printList(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }
        printList(nums);
//        printList(bubbleSort(nums));
//        printList(selectionSort(nums));
//        printList(insertionSort(nums));
        printList(shellSort(nums));
    }
}
