package tree;

/**
 * Created by bogehu on 16/8/18.
 */

public class BinaryTree<E extends Comparable<E>>extends AbstractTree<E> {
protected TreeNode<E> root;
    protected int size=0;

    public BinaryTree() {
    }

    public BinaryTree(E[] objects) {
        for (int i = 0; i <objects.length ; i++) {
           insert(objects[i]) ;
        }
    }
    // 查找
    public boolean search(E e){
        TreeNode<E> current=root;
        while (current!=null){
            if (e.compareTo(current.element)<0){
                current=current.left;
            }
            else if (e.compareTo(current.element)>0){
                current=current.right;
            }
            else
                return true;
        }
        return false;
    }
    //插入一个元素,如果插入成功,则返回true;
    public boolean insert(E e){
        if (root==null)
            //创建一个新的根节点
            root=createNewNode(e);
        else {
            TreeNode<E> parent=null;
            TreeNode<E> current=root;
            while (current!=null)
                if (e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                }
            else if (e.compareTo(current.element)>0){
                    parent=current;
                    current=current.left;
                }
            else
                    return false;
            if (e.compareTo(parent.element)<0)
                parent.left=createNewNode(e);
            else
                parent.right=createNewNode(e);

        }
        size++;
        return true;
    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<E>(e);
    }
    //中序遍历
    public void inorder(){inorder(root);}
    protected void inorder(TreeNode<E> root){
        if (root==null)
    return;
    inorder(root.left);
        System.out.print(root.element+" ");
    inorder(root.right);}

    //前序遍历
    public void preorder(){preorder(root);}
    protected void preorder(TreeNode<E> root){
        if (root==null)
            return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);}

    //后序遍历
    public void postorder(){postorder(root);}
    protected void postorder(TreeNode<E> root){
        if (root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");}
    public int getSize(){
        return size;
    }
    public TreeNode getRoot(){
        return root;
    }
}
