package org.jepsonw.datastructure.Stack;

/**
 * 一个能随时获取最小值的栈的实现
 * Created by jepsonw on 16-12-15.
 */
public class StackWithMin extends Stack<Integer> {

    Stack<Integer> stackMin;

    //构造函数
    public StackWithMin(){
        stackMin=new Stack<Integer>();
    }

    //取得栈中最小值
    public Integer min(){
        if(stackMin.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return stackMin.peek();
        }
    }

    //入栈操作
    public void push(Integer item){
       //将比栈顶元素小的值放入stackMin中
        if(item<=min()){
            stackMin.push(item);
        }
        super.push(item);
    }

    //出栈操作
    public Integer pop(){

        int value=super.pop();
        if(value==min()){
            stackMin.pop();
        }

        return value;
    }


}
