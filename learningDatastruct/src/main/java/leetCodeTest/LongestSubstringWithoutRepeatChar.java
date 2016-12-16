package leetCodeTest;

import java.util.HashMap;

/**
 * get Longest Substring whithout RepeatChar
 * Created by jepsonw on 16-12-15.
 */
public class LongestSubstringWithoutRepeatChar {

    public static void main(String[] args){
        String s="abccbad";

        LongestSubstringWithoutRepeatChar lswr=new LongestSubstringWithoutRepeatChar();
        int b=lswr.lengthOfLongestSubstring(s);
        System.out.println(b);


    }

    public int lengthOfLongestSubstring(String s){
       if(s.length()==0) return 0;
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        int max=0;


        //j 相当于子字符串中出现重复字符的当前游标
        for(int i=0,j=0;i<s.length();++i){

            if(map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i))+1);
            }

            map.put(s.charAt(i),i); //将出现过的字符和其指针进行存放到map中，如果出现重复的字符则将其指针存放到mapzhong
            max=Math.max(j,i-j+1); // 子字符串的长度 从0到j 或 j到i之间的字符串长度
        }
        System.out.println(map);
        return max;
    }
}
