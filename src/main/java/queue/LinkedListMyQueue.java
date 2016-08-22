package queue;

import java.util.LinkedList;

/**
 * Created by bogehu on 16/8/22.
 */
//通过数组来实现队列,增加队列的同步以实现多线程安全.
public class LinkedListMyQueue<E> {
    LinkedList<E> linkedList=new LinkedList<E>();
    private int size=0;
    public synchronized void push(E e){
        linkedList.addLast(e);
        size++;
    }
    public synchronized E pop(){
        size--;
        return linkedList.removeFirst();
    }
    public synchronized boolean isEmpty(){
        return size==0;
    }
    public synchronized int size(){
        return size;
    }

    public static void main(String[] args) {
        LinkedListMyQueue<Integer> linkedListMyQueue=new LinkedListMyQueue<Integer>();
        linkedListMyQueue.push(33);
        linkedListMyQueue.push(67);
        System.out.println("队列的长度是: "+linkedListMyQueue.size());
        System.out.println("队首元素是: "+linkedListMyQueue.pop());
    }
}
