package leetCodeTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Question:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices ofthe two numbers such that they add up to the target,
 * where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2)are not zero-based.
 * You may assume that each input would haveexactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 * method:
 * 1.暴力穷举法：双层for循环 时间复杂度O(N^2)
 * 2.Hash表 HashMap 给定一个数字，根据hash映射查找另一个数字是否在数组中，
 *  只需要O(1)的时间，但需要承担O(N)的hash表存储空间
 *
 * Created by jepsonw on 16-12-13.
 */
public class Array {
    @Test
    public void Test(){
        //int nums[] =new int[6];
        int nums[]= new int[]{2, 7, 11, 15, 1,8,7, 8};

        for(int i=0;i<nums.length;i++){
            //System.out.println(nums[i]);
        }
        int target=9;
        Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
        Map<Integer,Integer> map2=new HashMap<Integer,Integer>();

        Map<Integer,Object> result=new HashMap<Integer,Object>();
        for (int i=0;i<nums.length;i++){
            if (!map1.containsKey(target - nums[i])) {

                map1.put(nums[i], i);
            } else {
                int  n = map1.get(target-nums[i]);

                if ( n < i) {
                    //若存在的数组index n 小于i 则说明之前map中存过相应的target-num[i] ,即 num[n]+num[i]=target

                    System.out.println("[ "+ n+","+i+" ]");

                }
            }
        }


    }
}
