import java.util.NoSuchElementException;

public class circularlinkedlist {
    private Listnode last;
    private int length;
    private class Listnode{
        private Listnode next;
        private int data;

        public Listnode(int data){
            this.data=data;
        }
    }
        public circularlinkedlist(){
            last=null;
            length=0;
        }
        public int length(){
            return length;
        }
        public boolean isEmpty(){
            return length==0;
        }

        public void createcircularlinkedlist(){
            Listnode first=new Listnode(1);
            Listnode second=new Listnode(5);
            Listnode third=new Listnode(10);
            Listnode fourth=new Listnode(15);
            first.next=second;
            second.next=third;
            third.next=fourth;
            fourth.next=first;
            last=fourth;
        }

        public void display(){
            if(last==null)
            return;
            Listnode first=last.next;
            while(first!=last){
                System.out.print(first.data+"-->");
                first=first.next;
            }
            System.out.println(first.data);
        }

        public void insertfirst(int value){
            Listnode newnode=new Listnode(value);
            if(last==null){
                last=newnode;
                last.next=last;
            }
            else{
                newnode.next=last.next;
            }
            last.next=newnode;
            length++;
        }
        public void insertlast(int value){
            Listnode newnode=new Listnode(value);
            if(last==null){
                last=newnode;
                last.next=last;
            }
            else{
                newnode.next=last.next;
                last.next=newnode;
                last=newnode;
            }
            length++;
        }
        public Listnode deletefirst(){
            if(isEmpty())throw new NoSuchElementException();
            Listnode temp=last.next;
            if(last.next==null){
                last=null;
            }
            else{
                last.next=temp.next;
            }
            temp.next=null;
            length--;
            return temp;

        }
        public void deletelast(){
            if(isEmpty())throw new NoSuchElementException();
            Listnode first=last.next;
            Listnode temp=last.next;
            if(last.next==last)
            last=null;
            else{
                while(first.next!=last){
                    first=first.next;
                }
                last.next=null;
                last=first;
                last.next=temp;
            }
        }
        public static void main(String[] args) {
            circularlinkedlist csll=new circularlinkedlist();

            csll.createcircularlinkedlist();
            csll.display();
            csll.insertfirst(16);
            csll.display();
            csll.insertlast(18);
            csll.display();
            System.out.println(csll.deletefirst().data);
            csll.display();
            csll.deletelast();
            csll.display();
          







        }
    }

