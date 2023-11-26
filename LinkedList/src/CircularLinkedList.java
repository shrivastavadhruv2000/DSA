import java.util.Scanner;

public class CircularLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void creation() {
        int data, n = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if(head==null){
                head=new_node;
                tail=new_node;
                new_node.next=head;

            }
            else{
                new_node.next=head;
                head=new_node;
                break;
            }
            System.out.println("Enter 1 for add more");
            n=sc.nextInt();
        } while (n==1);
    }

    public void traverse(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("LL does not exist");
        }
        else{
            do{
                System.out.println(temp.data + " ");
            } while(temp!=head);
        }
    }
    public static void main(String[] args){
        CircularLinkedList l1=new CircularLinkedList();
        l1.creation();
        l1.traverse();
    }
}
