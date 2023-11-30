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
        System.out.println("enter left child of " + root);
        root.left=create();
        System.out.println("enter right child of " + root);
        root.left=create();

        return root;
    }


public static void main(String[] args) {
    Node root=create();

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

