public class queue {
    private Listnode front;
    private Listnode rear;
    private int length;
    public queue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    private class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int data){
        Listnode newnode=new Listnode(data);
        if(isEmpty()){
            front=newnode;
        }
        else{
            rear.next=newnode;
        }
        rear=newnode;
        length++;
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        Listnode current=front;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
        }
    
    public Listnode dequeue(){
        Listnode temp=front;
        if(isEmpty())throw new RuntimeException("queue empty");
        else{
            front=front.next;
            if(front==null)
            {
                rear=null;
            }
        }
        length--;
        return temp;

    }
    public static void main(String[] args) {
        queue q=new queue();
        q.enqueue(10);
        q.enqueue(11);
        q.display();
        System.out.println(q.dequeue().data);
        q.display();
    
    }
}
