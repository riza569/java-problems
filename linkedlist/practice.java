import java.util.List;

public class practice {
    private Listnode head;
    public static class Listnode{
        int data;
        Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(Listnode head){

        Listnode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void count(){
        int count=1;
        Listnode current=head;
        while(current.next!=null){
            count++;
            current=current.next;
        }
        System.out.println(count);
    }
    public  void insertfirst(int value){
        Listnode newnode=new Listnode(value);
      
            newnode.next=head;
            head=newnode;
        
    }
    public void insertlast(int value){
        Listnode newNode=new Listnode(value);
        Listnode current=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void insertatpos(int value,int position){
        Listnode newNode=new Listnode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }else{
        int count;
        Listnode previous=head;
            for(count=1;count<position-1;count++){
                previous=previous.next;
            }
            Listnode current=previous.next;
            newNode.next=current;
            previous.next=newNode;
    }}
    public Listnode deletefirst(){
        if(head==null){
            return null;
        }
        Listnode temp=head;


            head=head.next;
            temp.next=null;
        
        return temp;
    }
        //10-->11-->12-->13-->14-->null
    public Listnode deletelast(){
        if(head==null||head.next==null){
            return null;
        }
        Listnode current=head;
        Listnode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
         //10-->11-->12-->13-->14-->null

    public Listnode deleteatpos(int position){
        if(position==1){
            Listnode temp=head;
            head=head.next;
            temp.next=null;
            return temp;
        }
        else{
            Listnode previous=head;
            for(int count=1;count<position-1;count++){
                previous=previous.next;
            }
            Listnode current=previous.next;
            previous.next=current.next;
            current.next=null;
            return current;

        }
    }
    public boolean search(int value){
        Listnode current=head;
        if(head==null)
        return false;
        
        while(current.next!=null){
            if(current.data==value){
                return true;
            }
        current=current.next;
        }
        return false;

    }
    public Listnode reverse(Listnode head){
        if(head==null)
        return head;
        Listnode next=null;
        Listnode prev=null;
        Listnode current=head;
        while(current!=null){    
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;

    }
    public Listnode middle(){
        if(head==null)
        return null;
        Listnode slowptr=head;
        Listnode fastptr=head;
        while(fastptr!=null & fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;

        }
        return slowptr;
    }
    public Listnode nthnode(int n){
        Listnode refptr=head;
        Listnode mainptr=head;
        int count=0;
        if(n<0){
            throw new IllegalArgumentException("invalid value");
        }
        while(count<n){
            refptr=refptr.next;
            count++;
        }
        while(refptr!=null){
            refptr=refptr.next;
            mainptr=mainptr.next;
        }
        return mainptr;

    }
    public static void main(String[] args) {
        practice sll=new practice();
        sll.head=new Listnode(10);
        Listnode second=new Listnode(11);
        Listnode third=new Listnode(12);
        Listnode fourth=new Listnode(13);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.display(sll.head);
        sll.count();
        sll.insertfirst(9);
        sll.display(sll.head);      
        sll.insertlast(14);
        sll.display(sll.head);
        sll.insertlast(15);
        sll.display(sll.head);
        sll.insertatpos(5,2);
        sll.display(sll.head);
        sll.insertatpos(6,3);
        sll.display(sll.head);
        sll.insertatpos(4,1);
        sll.display(sll.head);
        System.out.println(sll.deleteatpos(2).data);
        sll.display(sll.head);
        System.out.println(sll.deleteatpos(5).data);
        sll.display(sll.head);
        System.out.println(sll.deleteatpos(1).data);
        sll.display(sll.head);
        // Listnode rev=sll.reverse(sll.head);
        // sll.display(rev);
        Listnode middlenode=sll.middle();
        System.out.println(middlenode.data);
        Listnode nthnode=sll.nthnode(2);
        System.out.println(nthnode.data);

    }
}
