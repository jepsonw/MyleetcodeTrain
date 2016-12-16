package org.jepsonw.datastructure.linkedList;

import org.jepsonw.datastructure.Node;
import org.junit.Test;

/**
 * 删除链表中重复的元素
 * 链表节点Node{
 *     下一个节点 node
 *     当前节点的数据 data
 * }
 * method：输入链表head 递归遍历节点数据 ，去除重复的节点
 * Created by jepsonw on 16-12-1.
 */
public class DeleteDups {
    public static void delete(Node<Integer> head){
        if(null ==head) return;

        Node<Integer> current=head;
        while (null !=current){

            Node<Integer> temp=current;
            while(null !=temp.next){
                //递归比较与当前节点数据重复的节点
                if(temp.next.data==current.data){
                    //若相等，则跳过下一个节点
                    temp.next=temp.next.next;
                }else{
                    //若不同，则继续比较
                    temp=temp.next;
                }
            }

            //比较完当前节点的data 后进行下一轮，对第二个节点的比较
            current=current.next;

        }
    }

    @Test
    public void TestDel(){
        Node<Integer> node1=new Node<Integer>(2);
        Node<Integer> node2=new Node<Integer>(2);
        Node<Integer> node3=new Node<Integer>(3);
        Node<Integer> node4=new Node<Integer>(4);
        Node<Integer> node5=new Node<Integer>(4);
        Node<Integer> node6=new Node<Integer>(5);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        Node<Integer> head=node1;
        System.out.println("before delete linkedList...");
        while(node1!=null){

            System.out.print(node1.data+" ");
            node1=node1.next;
        }
        System.out.println("\r\n delete linkedList...");
        delete(head);

        node1=head;
        while(node1!=null){
            System.out.print(node1.data+" ");
            node1=node1.next;
        }

    }
}
