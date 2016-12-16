package org.jepsonw.datastructure.Stack;

/**
 * 记录栈的最大存储容量和栈中内容实际索引值
 * Created by jepsonw on 16-12-15.
 */
public class StackCapacity<T> extends Stack<T> {
    private int capacity;
    private int index=0;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    //
    public StackCapacity(int index){
        this.index=index;
    }

}
