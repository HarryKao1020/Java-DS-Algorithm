package JavaBasicDS.StackAndQueue;

// Queue is FIFO
public class LinkedListQueue {
    private ListNode front ,rear; // 頭節點front,尾結點rear
    private int queSize = 0;

    public LinkedListQueue(){
        front = null;
        rear =null;
    }

    public int size(){
        return queSize;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public void push(int num){
        ListNode node = new ListNode(num);
        if(front == null){ // 如果queue是空的
            front = node;
            rear = node;
        }else{ // 非空的
            rear.next = node;
            rear = node;
        }
        queSize++;
    }

    // 取出頭並顯示
    public int pop(){
        int num;
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            num  = front.val;
            front = front.next;
        }
        queSize--;
        return num;
    }

    //顯示頭
    public int peak(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            return front.val;
        }
    }

    public int[] toArray(){
        ListNode node = front;
        int[] res = new int[size()];
        for(int i =0 ; i< res.length ; i++){
            res[i] = node.val;
            node = node.next;
        }
        return res;
    }
}
