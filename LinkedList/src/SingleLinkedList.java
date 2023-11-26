import java.util.Scanner;

public class SingleLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    public void creation()
    {
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the data");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null){
                head=new_node;
            }
            else
            {
                System.out.println("Enter 1 to insert at the beginning, 2 for at the end, 3 for at the position");
                int m=sc.nextInt();
                Node temp=head;
                switch(m){
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        break;
                    case 2:
                        //Node temp=head;
                        while(temp.next!=null){
                            temp=temp.next;

                        }
                        temp.next=new_node;
                        break;
                    case 3:
                        //Node temp=head;
                        System.out.println("Enter the specific position");
                        int pos=sc.nextInt();

                        for(int i=0;i<pos-1;i++) {
                            temp = temp.next;
                        }
                        new_node.next=temp.next;
                        temp.next=new_node;

                }
            }
            System.out.print("Press 1 to add mode data: ");
            n=sc.nextInt();

        }while(n==1);



    }

    public void delete() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {

            if (head == null) {
                System.out.println("LL is empty");
            } else {
                System.out.println("Enter 1 to delete at the beginning, 2 for at the end, 3 for at the position");
                int m = sc.nextInt();
                Node temp=head;
                Node ptr=temp.next;

                switch (m) {
                    case 1:
                       //Node temp=head;
                       temp=temp.next;
                       head=temp;
                       break;
                    case 2:
                        //Node temp=head;
                        //Node ptr=temp.next;
                        while(ptr.next!=null){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=null;
                        break;



                    case 3:
                        System.out.println("Enter the Position to be deleted");
                        int pos=sc.nextInt();
                        //Node temp=head;
                        for(int i=0;i<(pos-2);i++){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=ptr.next;
                        break;


                }
            }
            System.out.print("Press 1 to delete mode data: ");
            n = sc.nextInt();

        } while (n == 1);

    }
        public void traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("LL does not exist");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        SingleLinkedList l1=new SingleLinkedList();
        l1.creation();
        l1.traverse();
        l1.delete();
        l1.traverse();
    }
}
