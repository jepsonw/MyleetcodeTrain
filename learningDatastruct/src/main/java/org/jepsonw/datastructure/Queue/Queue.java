package org.jepsonw.datastructure.Queue;

import org.jepsonw.datastructure.Node;

/**
 * 对列的实现
 * Created by jepsonw on 16-12-7.
 * @see IQueue
 * @see org.jepsonw.datastructure.Node
 */
public class Queue<T> implements IQueue<T> {

    Node<T> first,last;

    /**
     * 入队列
     * @param item
     */
    @Override
    public void enqueue(T item) {
        if(first==null){
            //初始对列为空
            last=new Node<T>(item);
            first=last;
        }else{
            //队列中有值，入栈时则加入队列尾
            last.next= new Node<T>(item);
            last=last.next;
        }
    }

    /**
     * 出队列操作
     * 先入先出
     * @return
     */
    @Override
    public T dequeque() {
        if(first !=null){
            T item=first.data;
            first=first.next;
            return item;
        }
        return null;
    }

    /**
     * 返回队列头，但不退出队列
     * @return
     */
    @Override
    public T peek() {
        if(first!=null){
            return first.data;
        }
        return null;
    }

    /**
     * 队列是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {

        return first==null;
    }
}
