public class practic {
    private Listnode head;
    public static class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public void display(){
        Listnode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertfirst(int value){
        Listnode newNode=new Listnode(value);
        newNode.next=head;
        head=newNode;
    }
    public void isertlast(int value){
        Listnode newNode=new Listnode(value);
        if(head==null){
            head=newNode;
            return;
        }
        Listnode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;


    }
    public  void insert(int value,int position){
        Listnode newNode=new Listnode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            Listnode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            Listnode current=previous.next;
            newNode.next=current;
            previous.next=newNode;

        }
    }
    public static void main(String[] args) {
        
        practic sll=new practic();
        sll.head=new Listnode(10);
        Listnode second=new Listnode(1);
        Listnode third=new Listnode(2);
        Listnode fourth=new Listnode(3);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.display();

        sll.count();
        sll.insertfirst(5);
        sll.display();
        sll.isertlast(15);
        sll.display();
        sll.insert(13,5);
        sll.display();


    }
    private int count() {
        Listnode current=head;
        if(head==null){
            return 0;
        }
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
}
