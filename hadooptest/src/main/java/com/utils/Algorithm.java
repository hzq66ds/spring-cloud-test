package com.utils;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

/**
 * 排序算法
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/8/23.
 * @author HZQ-PC
 */
public class Algorithm {

    private static Random random = new Random();

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
     * 归并排序
     * @param array
     * @return
     */
    public static int[] mergeSort(int[] array){
        if (array == null || array.length == 0 || array.length < 2){
            return array;
        }
        int midle = array.length>>1;
        int[] left = Arrays.copyOfRange(array,0,midle);
        int[] rigt = Arrays.copyOfRange(array,midle,array.length);
        return merge(mergeSort(left),mergeSort(rigt));
    }
    private static int[] merge(int[] left,int[] rigt){
        if (left == null || left.length == 0){
            return rigt;
        }
        if (rigt == null || rigt.length == 0){
            return left;
        }
        int[] result = new int[left.length + rigt.length];
        for (int i = 0, lindex = 0, rindex = 0; i < result.length; i++) {
            if (lindex>=left.length){
                result[i] = rigt[rindex++];
            }else if (rindex>=rigt.length){
                result[i] = left[lindex++];
            }else if(rigt[rindex] > left[lindex]){
                result[i] = left[lindex++];
            }else{
                result[i] = rigt[rindex++];
            }
        }
        return result;
    }

    /**
     * 快速排序
     * @param array
     * @return
     */
    public static int[] quickSort(int[] array,int statindex,int endindex){
        if (array == null || array.length == 0 || array.length == 1 || statindex == endindex || statindex == endindex -1){
            return array;
        }
        int midleindex = statindex;
        //将statindex到endindex的数据进行快速排序
        for (int i = midleindex; i < endindex; i++) {
            //默认取最后一个数为基数，将比基数大的数排在最前边
            if (array[i] < array[endindex-1]){
                swapNums(array, midleindex, i);
                midleindex++;
            }
        }
        //将比基数大的数排在最前边后，再将基数排在中间，基数的位置已经确定，不参与后续的排序
        swapNums(array, midleindex, endindex-1);
        if (endindex - statindex > 1) {
            //基数位置已经确定，不参与后续的排序
            quickSort(array, statindex, midleindex);
            quickSort(array, midleindex + 1, endindex);
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

    public static int getRandomNum(int maxnum){
        return random.nextInt(maxnum);
    }

//    public static void main(String[] args) {
//
//        int[] nums = new int[20];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = getRandomNum(100);
//        }
//        printList(nums);
////        printList(bubbleSort(nums));
////        printList(selectionSort(nums));
////        printList(insertionSort(nums));
////        printList(shellSort(nums));
////        printList(mergeSort(nums));
//        printList(quickSort(nums,0,nums.length));
//    }
}
