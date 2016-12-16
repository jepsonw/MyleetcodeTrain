package org.test.datastruct.StackTest;

import org.jepsonw.datastructure.Stack.IStack;
import org.jepsonw.datastructure.Stack.Stack;
import org.jepsonw.datastructure.Stack.StackWithMin;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jepsonw on 16-12-15.
 */
public class StackTest {
    IStack<Integer> stack;

    @Test
    public void testStack(){
        stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        System.out.println(".....");
        Assert.assertEquals(Integer.valueOf(2),stack.peek()); //读取栈顶元素
        Assert.assertEquals(Integer.valueOf(2),stack.pop()); //出栈操作

        stack.push(3);
        Assert.assertEquals(Integer.valueOf(3),stack.pop());
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(Integer.valueOf(1),stack.pop());

        Assert.assertEquals(null,stack.peek());
        Assert.assertEquals(null,stack.pop());
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackWithMin(){
        StackWithMin s=new StackWithMin();

        s.push(4);
        s.push(2);
        Assert.assertEquals(Integer.valueOf(2),s.min());

        s.push(3);
        Assert.assertEquals(Integer.valueOf(2),s.min());

        s.push(1);
        Assert.assertEquals(Integer.valueOf(1),s.min());


        Assert.assertEquals(Integer.valueOf(1),s.peek());
        Assert.assertEquals(Integer.valueOf(1),s.pop());
        Assert.assertEquals(Integer.valueOf(2),s.min());

    }
}
