package org.jepsonw.datastructure.linkedList;

import org.jepsonw.datastructure.Node;

/**
 * 链表循环
 * 1.判断链表是否存在环
 * 2.若链表存在环则求出环的长度
 * 3.找出环儿的链接点
 * Created by jepsonw on 16-12-1.
 */
public class linkedListLoop {

    /**
     * 判断单链表是否存在环
     * 思路：
     * 假设有两个结点 fast,slow  fast每次向前移动一步，slow 每次向前移动一步.
     * 如果单链表存在环，则 fast和slow 在某一点会相遇;否则q将首先遇到null
     * 1. 如果两个指针的速度不一样，比如p，q，( 0<p<q)二者满足什么样的关系，可以使得两者肯定交与一个节点
     * Sp(i)=pi
     * Sq(i)=k+qi
     * 如果两个要相交于一个节点，则 Sp(i) = Sq(i) =>  (pi) mod n = ( k+ qi ) mod n =>[ (q -p)i + k ]  mod n =0
     * =>(q-p)i+k=N*n [N 为自然数]
     * =>i=(N*n)/(p-q)
     * i 取自然数，则当p,q满足上面等式 即存在一个自然数N，可以满足Nn -k 是 p - q 的倍数时，保证两者相交
     *  特例：如果q 是p 的步长的两倍，都从“同一个起点”开始，即 q = 2p , k =0, 那么等式变为： Nn=i： 即可以理解为，当第i次迭代时，i是圈的整数倍时，两者都可以交，交点就是为起点
     * @param header
     * @return boolean;
     */
    public static boolean isExitloop(Node header){

        //定义两个Node类型的指针fast,slow fast移动步长为2，slow移动步长为1
        Node fast=header;
        Node slow=header;

        while (fast !=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;

            //如果相遇则存在环儿，则跳出
            if(fast==slow){
                break;
            }

        }

        //根据跳出循环时，fast的值来判断 return;如果结束循环时fast !=null 则说明存在环。若fast==null 则说明不存在环
        if(fast ==null || fast.next==null){
            return false;
        }else{
            return true;
        }
    }

    /**
     *2.计算有环儿链表的环儿长度
     * 思路：了解到q已经进入到环里，保存该位置。然后由该位置遍历，当再次碰到q位置即可，所迭代的次数就是环的长度
     *fast slow从碰撞点出发再次碰撞就是环儿的长度
     *
     *
     */
    public static int loopLength(Node header){
        if(!isExitloop(header)){
            return 0;
        }

        //定义两个指针
        Node fast=header;
        Node slow=header;
        int length=0;
        boolean begin=false;
        boolean again=false;
        while(fast !=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;

            //当遇到环儿，且循环完第二遍时
            if(fast==slow && again==true){

                break;
            }

            //当遇到环，超过一圈后开始计时
            if(fast==slow && again==false){
                begin=true;
                again=true;
            }

            if(begin==true){
                ++length;
            }


        }

        return length;

    }

    /**
     * 3.如何找到链表中的第一个在环里的节点
     * 定理：碰撞点到连接点的距离=头指针到连接点的距离
     * 因此，分别从碰撞点，头指针开始走，相遇的那个点即链接点
     * 1) 定义两个指针p1和p2,在初始化时都指向链表的头节点
     * 2）如果链表中的环有n个节点，指针p1先在链表上向前移动n步
     * 3）然后指针p1和p2以相同的速度在链表上向前移动直到它们相遇
     * 4）它们相遇的节点就是环的入口节点
     */
    public static Node findLoopEntrance(Node header){
        Node fast=header;
        Node slow=header;
        //1.判断是否有环
        while(fast!=null &&fast.next!=null){
            //当较快的指针先遇到 null时，无环，结束循环
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                //如果有环
                break;
            }
        }

        slow=header; //慢指针从头节点开始跑，快指针从碰撞点开始跑，二者速度一样
        while(slow !=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }


}
