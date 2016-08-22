package queue;

/**
 * Created by bogehu on 16/8/22.
 */
//通过链表来实现队列
public class MyQueue<E> {
    private Node<E> head=null;
    private Node<E> tail=null;
    //判断队列是否为空
    public boolean isEmpty(){
        return head==tail;
    }
    // 入队
    public void push(E data){
        Node<E> newNode=new Node<E>(data);
        //判断队列是否为空
        if (head==null&&tail==null){
            head=tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    //出队
    public E pop(){
        if (this.isEmpty())
            return null;
        E data=head.data;
        head=head.next;
        return data;
    }
    //队列的长度
    public int size(){
        Node<E> tmp=head;
        int n=0;
        while (tmp!=null)
        {n++;
        tmp=tmp.next;}
        return n;
    }

}
class Node<E>{
    //首先创建加点Node
    Node<E> next=null;
    E data;
    public Node(E data){
        this.data=data;
    }

    public static void main(String[] args) {
        MyQueue<Integer> myQueue=new MyQueue<Integer>();
        myQueue.push(3);
        myQueue.push(7);
        myQueue.push(4);
        myQueue.push(2);
        myQueue.push(45);
        System.out.println("队列的长度是: "+ myQueue.size());
        System.out.println("队列首元素是: "+myQueue.pop());
        System.out.println("队列首元素是: "+myQueue.pop());
        System.out.println("队列首元素是: "+myQueue.pop());
    }
}