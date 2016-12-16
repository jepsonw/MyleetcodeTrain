package leetCodeTest;

import org.junit.Test;

/**
 * Question：
 * Calculate the sum of two integers a and b,
 * but you are not allowed to use the operator + and -。
 * Example:
 * Given a=1 and b=2, return 3
 * Method：
 * 位操作实现加减乘除4则运算。
 * 异或：两位单独位相加的结果
 * 与：可以表示进位的结果
 * For example 11+5
 * 二进制形式：
 * 11： 1011
 * 5 ： 0101
 * 思路：1.上述两数二进制中位置都为1的就需要进位，即进位值就为0001
 * 原位值两个数相加的结果为那个位置值的异或，即 1110
 * 2.接下来就是要把进位位和下一位相加，所以进位值左移一位，即0001变为0010，重复上面操作可得新的进位值为0010
 * 原位值异或（即相加）结果为1100
 * 3.继续重复上面操作直到进位为0，可得到最终结果10000,即16
 *
 * 相关：
 * java 位运算
 * 1.<< 左移
 * 2.>> 右移 高位补符号位
 * 3.>>> 无符号右移 高位补 0
 * 4.& 位与
 * 5.| 位或
 * 6.^ 位异或
 * 7.~ 位非
 * Created by jepsonw on 16-12-14.
 */
public class SumOfTwoIntegers {

    @Test
    public void getSum(){
        int c;//进位
        int a=11,b=5;

        System.out.println("----PRINT NUM----");
        System.out.println("a:"+Integer.toBinaryString(a));
        System.out.println("b:"+Integer.toBinaryString(b));
        while(b!=0){
            System.out.println("按位于操作~");
            c=(a&b)<<1; //按位与操作， 进位项
            System.out.println("..."+Integer.toBinaryString(c));
            a=a^b; //按位异或操作， 即两位数相加
            System.out.println("按位异或操作~");
            System.out.println("..."+Integer.toBinaryString(a));
            b=c; //将进位操作,进位赋值给b，循环操作
        }

        System.out.println(a);
    }
}
