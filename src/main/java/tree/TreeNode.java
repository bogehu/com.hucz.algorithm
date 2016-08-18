package tree;

/**
 * Created by bogehu on 16/8/18.
 */
 public class TreeNode<E extends Comparable<E>> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E e) {
        element=e;
    }

}
