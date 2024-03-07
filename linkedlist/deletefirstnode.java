public class deletefirstnode {
    private Listnode head;
    public static class Listnode{
        int data;
        Listnode next;
    
    public Listnode(int data){
        this.data=data;
        this.next=null;
    } 
}
public Listnode deletefirst(){
    if(head==null){
        return null;
    }
    Listnode temp=head;
    head=head.next;
    temp.next=null;
    return temp;
}
//10-->1-->2-->3-->null
public Listnode deletelastnode(){
    Listnode current=head;
    Listnode previous=null;
    if(head==null||head.next==null)
    return head;
    while(current.next!=null){
        previous=current;
        current=current.next;
    }
    previous.next=null;
    return current;
}
public void display() {
    Listnode current=head;
    while(current!=null){
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    deletefirstnode sll=new deletefirstnode();
    sll.head=new Listnode(10);
    Listnode second=new Listnode(1);
    Listnode third=new Listnode(2);
    Listnode fourth=new Listnode(3);
    sll.head.next=second;
    second.next=third;
    third.next=fourth;
    sll.display();
    System.out.println(sll.deletefirst().data);
    sll.display();
    System.out.println(sll.deletelastnode().data);
    sll.display();

}



}
