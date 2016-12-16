package org.jepsonw.datastructure.Stack;

import org.jepsonw.datastructure.Node;
import org.junit.Test;

/**
 * Created by jepsonw on 16-12-15.
 */
public class Stack<T> implements IStack<T> {
    Node<T> top;

    //入栈操作
    @Override
    public void push(T item) {
        Node<T> t=new Node<T>(item);
        t.next=top;
        top=t;
    }




    //出栈操作
    @Override
    public T pop() {
        if(top!=null){
            T item=top.data;
            top=top.next;
            return item;
        }
        return null;
    }

    //读栈顶元素
    @Override
    public T peek() {
        if(top!=null){
            return top.data;
        }
        return null;
    }

    //判断栈是否为空.
    @Override
    public boolean isEmpty() {
        return (top==null);
    }

}
