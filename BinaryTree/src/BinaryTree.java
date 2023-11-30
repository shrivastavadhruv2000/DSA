import java.util.Scanner;

public class BinaryTree {
    static Node create() {
        int data;
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("enter value");
        data = sc.nextInt();
        if (data == -1)
            return null;
        root=new Node(data);
        System.out.println("enter left child of " + root.data);
        root.left=create();
        System.out.println("enter right child of " + root.data);
        root.left=create();

        return root;
    }
    static void inorder(Node root){
        if (root==null)
            return;

            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);


    }

    static void preorder(Node root){
        if (root==null)
            return;


        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);


    }

    static void postorder(Node root){
        if (root==null)
            return;



        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");


    }




public static void main(String[] args) {
    Node root=create();
    inorder(root);
    postorder(root);
    preorder(root);

}
}

class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }

}

