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
                System.out.println("Enter 1 to insert at the beginning, 2 for at the end, 3 for at the position");
                int m=sc.nextInt();
                switch(m){
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        tail.next=head;
                        break;
                    case 2:
                        tail.next=new_node;
                        tail=new_node;
                        new_node.next=head;
                        break;
                    case 3:
                        System.out.println("Enter the position");
                        int pos=sc.nextInt();
                        Node temp=head;
                        for(int i=0;i<(pos-1);i++){
                            temp=temp.next;

                        }
                        new_node.next=temp.next;
                        temp.next=new_node;
                        break;



                }
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
                temp=temp.next;
            } while(temp!=head);
        }
    }
    public static void main(String[] args){
        CircularLinkedList l1=new CircularLinkedList();
        l1.creation();
        l1.traverse();
    }
}
