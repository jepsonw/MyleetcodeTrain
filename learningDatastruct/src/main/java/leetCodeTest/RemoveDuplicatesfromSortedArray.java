package leetCodeTest;

import org.junit.Test;

/**Array
 * description:
 * Given a sorted array, remove the duplicates in place such that each element appear
 * only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,Given input array A=[1,1,2]
 * Your function should return length=2 and A is now [1,2]
 *
 * Method:
 * 数组是已经排好序的。若把数组当作无序数组进行操作
 * 题目要求不能申请额外空间，
 * 另外注意的是，数组中元素的位置不能改变。比如对于数组[1,1,1,4,5],移出重复元素后为[1,4,5]
 * 对数组进行遍历一次，并设置一个计数器，每当遍历前后元素不同，计数器+1，并将计数器对应在数组中位置定位到当前遍历的元素
 * Created by jepsonw on 16-12-14.
 */
public class RemoveDuplicatesfromSortedArray {


    public void removeDuplicates( ){

        int[] A;
        A= new int[]{1, 1, 3, 3, 4};
        int count=1;
        for (int i=1;i<A.length;i++){

            if(A[i]==A[i-1]){
                continue;
            }else{
                A[count]=A[i];
                count++;
            }
        }

        for(int i=0;i<count;i++){
            System.out.print(A[i]);
        }

        System.out.println("\n");
        System.out.println(count);
    }

    /**
     * Follow up for "Remove Duplicates" : What if duplicates are allowed at most twice?
     * For example,Given sorted array A=[1,1,1,2,2,3],
     * Your function should return length=5 and A is now [1,1,2,2,3]
     * Method:
     * 加一个变量记录一下元素出现的次数即可。这题因为是已经排序的数组,所以一个变量即可解
     * 决。如果是没有排序的数组, 则需要引入一个 hashmap 来记录出现次数。
     */
    @Test
    public void RemDupII(){

        int[] A;
        A=new int[]{1,1,1,2,2,3,3};
        int count=1;
        int index=2;
        int n=A.length;

        if(n<=2){
         System.out.println(n);
        }

        for(int i=2;i<A.length;i++){
            if(A[i]!=A[i-2]){
                //doub++; 如果相隔第3个不相等
                A[index++]=A[i];
            }
        }



        System.out.println(index);
        for(int i=0;i<index;i++){
            System.out.print(A[i]+",");
        }

    }
}
