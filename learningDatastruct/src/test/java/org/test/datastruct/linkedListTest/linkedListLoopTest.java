package org.test.datastruct.linkedListTest;

import org.jepsonw.datastructure.Node;
import org.jepsonw.datastructure.linkedList.linkedListLoop;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jepsonw on 16-12-1.
 */
public class linkedListLoopTest {

    @Test
    public void test(){

        Node<Integer> node1=null;
        Node<Integer> node2=null;
        Node<Integer> node3=null;
        Node<Integer> node4=null;
        Assert.assertFalse(linkedListLoop.isExitloop(node1));
        Assert.assertEquals(0,linkedListLoop.loopLength(node1));
        Assert.assertEquals(null,linkedListLoop.findLoopEntrance(node1));


        node1=new Node<Integer>(1);
        node1.next=node1;
        Assert.assertTrue(linkedListLoop.isExitloop(node1));

        node1=new Node<Integer>(1);
        node2=new Node<Integer>(2);
        node1.next=node2;
        node2.next=node1;
        Assert.assertTrue(linkedListLoop.isExitloop(node1));
        Assert.assertEquals(2,linkedListLoop.loopLength(node1));
        Assert.assertEquals(node1,linkedListLoop.findLoopEntrance(node1));


        node1=new Node<Integer>(1);
        node2=new Node<Integer>(2);
        node3=new Node<Integer>(3);
        node1.next=node2;
        node2.next=node3;
        node3.next=node2;
        Assert.assertTrue(linkedListLoop.isExitloop(node1));
        Assert.assertEquals(2,linkedListLoop.loopLength(node1));
        Assert.assertEquals(node2,linkedListLoop.findLoopEntrance(node1));


        node1=new Node<Integer>(1);
        node2=new Node<Integer>(2);
        node3=new Node<Integer>(3);
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;
        //会报空指针异常
        Assert.assertTrue(linkedListLoop.isExitloop(node1));
        Assert.assertEquals(3,linkedListLoop.loopLength(node1));
        Assert.assertEquals(node1,linkedListLoop.findLoopEntrance(node1));

        node1=new Node<Integer>(1);
        node2=new Node<Integer>(2);
        node3=new Node<Integer>(3);
        node4=new Node<Integer>(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        Assert.assertTrue(linkedListLoop.isExitloop(node1));
        Assert.assertEquals(3,linkedListLoop.loopLength(node1));
        Assert.assertEquals(node2,linkedListLoop.findLoopEntrance(node2));




    }
}
