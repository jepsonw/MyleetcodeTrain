package org.jepsonw.datastructure.String;

/**
 * Created by jepsonw on 16-12-15.
 */
public class StringEqur {
    /**
     * 字符串比较
     */
    public static void main(String[] args){
        //s1 和 s2 被分配到永久区(方法区)的运行时常量池的相同的内存
        String s1="abc";
        String s2="abc";

        //s3 和 s4 被分配到堆中的两个不同对象
        String s3=new String("abc");
        String s4=new String("abc");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3==s4);//两个不同的对象
        System.out.println(s3.equals(s4));

        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));

    }

}
