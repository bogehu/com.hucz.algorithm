package tree;

import java.util.Iterator;

/**
 * Created by bogehu on 16/8/18.
 */
public interface Tree<E extends Comparable<E>> {
    public boolean search(E e);
    public boolean insert(E e);
    //public boolean delete(E e);
    public void inorder();
    public void preorder();
    public void postorder();
    public boolean isEmpty();
    public int getSize();
    public Iterator iterator();
}
