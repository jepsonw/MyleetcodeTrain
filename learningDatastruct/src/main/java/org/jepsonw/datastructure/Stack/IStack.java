package org.jepsonw.datastructure.Stack;

/**
 * Created by jepsonw on 16-12-15.
 */
public interface IStack<T> {


    /**
     * 入栈操作
     * @param item
     */
    void push(T item);

    /**
     * 出栈操作
     * @return
     */
    T pop();

    /**
     * 返回栈顶元素，但不出栈
     */
    T peek();

    /**
     * 栈是否为空
     * @return boolean
     */
    boolean isEmpty();

}
