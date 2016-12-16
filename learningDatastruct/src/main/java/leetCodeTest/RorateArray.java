package leetCodeTest;

import org.junit.Test;

/**
 * Rotate an array of n elements to the right by k steps
 * For example, with n = 7 and k = 3,
 * the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
 *
 * method : 双指针技术
 * Created by jepsonw on 16-12-16.
 */
public class RorateArray {


    /**
     * method： 从5开始，逐个将5以后的数移动到指定位置
     * [7,1,2,3,4,5,6] [6,7,1,2,3,4,5] [5,6,7,1,2,3,4]
     */
    public void rotate(int[] nums,int k){

        //从最后的开始挨个旋转
        int n=nums.length;
        int temp;
        for (int step=0;step<k;step++){
            //旋转k次
            temp=nums[n-1];//取数组最后的一位数字
            for (int i=n-1;i>0;--i){
                // --i 先从自减然后在进行下面的步骤
                //将第 i-1个数字向后移一位
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
        }

        for(int i=0;i<nums.length;i++){

            System.out.print(" "+nums[i]+" ");
        }
    }

    /**
     * 1.先翻转 5 前面的数据， 然后在翻转 5后面的数字 最后再整体翻转
     * 
     * @param nums
     * @param k
     */
    public void rotateTwo(int[] nums,int k){

    }

    @Test
    public void Test(){

        int[] nums=new int[]{1,2,3,4,5,6,7};
        int k=3;
        RorateArray ra=new RorateArray();
        ra.rotate(nums,k);



    }
}
