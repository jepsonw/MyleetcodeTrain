package org.jepsonw.datastructure.Queue;

/**
 * 队列的接口
 * Created by jepsonw on 16-12-7.
 */
public interface IQueue<T> {
    /**
     * 入队列操作
     * @param item
     */
    void enqueue(T item);

    /**
     * 出队列操作
     * @return
     */
    T dequeque();

    /**
     * 返回队列头，但不退出多列
     * @return
     */
    T peek();

    /**
     * 队列是否为空
     * @return
     */
    boolean isEmpty();
}
