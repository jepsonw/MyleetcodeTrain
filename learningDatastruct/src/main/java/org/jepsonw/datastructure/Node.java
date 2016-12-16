package org.jepsonw.datastructure;

/**
 * 链表的节点
 * Created by jepsonw on 16-12-1.
 */
public class Node<T> {
    public  Node<T> next;
    public T data;

    public Node(T datas){
        data=datas;
    }
}
