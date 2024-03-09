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
public Listnode deleteatpos(int position){
    if(position==1){
        Listnode temp=head;
        head=head.next;
        return temp;
    }
    else{
        Listnode previous=head;
        int count;
        for(count=1;count<position-1;count++){
            previous=previous.next;
        }
        Listnode current=previous.next;
        previous.next=current.next;
        return current;

    }
} 
public boolean search(int searchKey){
    if (head==null){
        return false;
    }
    Listnode current=head;
    while(current.next!=null){
        if(current.data==searchKey){
            return true;
        }
        current=current.next;
    }
    return false;
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
    // System.out.println(sll.deletefirst().data);
    // sll.display();
    // System.out.println(sll.deletelastnode().data);
    // sll.display();
    // System.out.println(sll.deletelastnode().data);
    // sll.display();
    // System.out.println(sll.deletefirst().data);
    // sll.display();
    // System.out.println(sll.deleteatpos(3).data);
    // sll.display();
    // System.out.println(sll.deleteatpos(2).data);
    // sll.display();
    // System.out.println(sll.deleteatpos(1).data);
    // sll.display();
    // System.out.println(sll.deleteatpos(1).data);
    // sll.display();
    if(sll.search(11)){
        System.out.println("found");
    }
    else{
        System.out.println("not found");
    }

}
}
