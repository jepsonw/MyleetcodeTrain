package org.jepsonw.datastructure.linkedList;

import org.jepsonw.datastructure.Node;

/**
 * 给出一个值，将链表中左边数据都小于此值，右边的值都大于等于此值
 * 思路：
 * 1.比较节点中的data与k进行比较
 * 2.将比k小的节点组合成k左边的链表 A，将比k大的节点组合成k右边的链表 B
 * 3.将链表 A B 进行组合成一个链表 C
 * 4.返回 链表C
 * Created by jepsonw on 16-12-2.
 */
public class SortWithValue {

    public static Node<Integer> sortGood(Node<Integer> node,int x){

        if(node==null){
            return node;
        }
        Node<Integer> beforeStart=null; //定义数字k左边的链接点
        Node<Integer> afterStart=null; //定义数字k右边的链接点

        while(node != null){

            Node<Integer> next=node.next;//创建临时变量

            if(node.data<x){
                //如果data小于x，将node放在x的左边链表上 beforeStart
                node.next=beforeStart; //组合左边的链表
                beforeStart=node;
            }else{
                node.next=afterStart;
                afterStart=node;
            }

            node=next;
        }

        //将左右两边的链表进行，定义head指针
        Node<Integer> head=null;
        if(beforeStart==null){
            head=afterStart;
        }else {
            head=beforeStart;
            while(beforeStart.next !=null){
                beforeStart=beforeStart.next;
            }
            beforeStart.next=afterStart;
        }

        return head;
    }

}
