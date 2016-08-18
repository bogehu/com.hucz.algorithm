package tree;

/**
 * Created by bogehu on 16/8/18.
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree<String> tree=new BinaryTree<String>();
        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");
        tree.insert("G");
        System.out.print("Inorder sorted: ");
        tree.inorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nThe number of nodes is "+tree.getSize());
        System.out.println("\nIs Peter in the tree?"+tree.search("Peter"));
    }
}
