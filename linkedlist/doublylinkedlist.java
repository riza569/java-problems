import java.util.NoSuchElementException;

public class doublylinkedlist {

    private Listnode head;
    private Listnode tail;
    private int length;
    private class Listnode{
        int data;
        Listnode prev;
        Listnode next;
        public Listnode(int data){
            this.data=data;
        }

    }
    public doublylinkedlist(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void frwdddisplay(){
        Listnode temp=head;
        if(head==null)
        return;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void insertfirst(int value){
        Listnode newnode=new Listnode(value);
        if(isEmpty()){
            tail=newnode;
        }
        else{
            head.prev=newnode;
            newnode.next=head;
        }
        head=newnode;
        length++;

    }

    public void insertlast(int value){
        Listnode newnode=new Listnode(value);
        if(isEmpty()){
            head=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
        }
        tail=newnode;
        length++;
    }
    public Listnode deletefirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Listnode temp=head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.prev=null;
        }
        head=head.next;
        temp.next=null;
        return temp;

    }
    public Listnode deletelast(){
        Listnode temp=tail;
        if(isEmpty()){
        throw new NoSuchElementException();
      }
        if(head==tail){
            head=null;
        }
        else{
            tail.prev.next=null;
        }
        tail=tail.prev;
        temp.prev=null;
        return temp;

    }

    public static void main(String[] args) {
        doublylinkedlist dll=new doublylinkedlist();
        dll.insertfirst(2);
        dll.insertfirst(1);
        dll.insertlast(3);
        dll.insertlast(4);
        dll.frwdddisplay();
        System.out.println(dll.deletefirst().data);
        dll.frwdddisplay();
        System.out.println(dll.deletelast().data);
        dll.frwdddisplay();

  }
}
