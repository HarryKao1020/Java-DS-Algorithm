
class Node{
    int data;
    Node next; //指到下個節點
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListPractice {
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp=temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete(int data){
        if(head == null){
            return;
        }
        if(head.data ==data){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null & temp.next.data !=data){
            temp = temp.next;
        }
        if (temp.next != null){
            temp.next = temp.next.next;
        }

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.printf(temp.data+"-->");
            temp= temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListPractice linkedList1 = new LinkedListPractice();
        linkedList1.insert(15);
        linkedList1.insert(20);
        linkedList1.insert(34);
        linkedList1.delete(20);
        linkedList1.display();
    }
}

