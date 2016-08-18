package stack;

/**
 * Created by bogehu on 16/8/17.
 */
//将元素类型扩展到泛型类型,用来自定义泛型类.
public class GenericStack<E> {
    //利用arraylist来创建一个栈
    private java.util.ArrayList<E> list=new java.util.ArrayList<E>();
    //也可以不使用泛型,只要将元素类型设置为Object,就可以适应任何对象类型
    //private java.util.ArrayList<Object> list=new ArrayList<Object>();
    public int getSize(){
        return list.size();
    }
    public E peek(){
        return list.get(getSize()-1);
    }
    //public E peek(){return list.get(getSize()-1);}
    public void push(E o){
        list.add(o);
    }
    public E pop(){
        E o=list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
