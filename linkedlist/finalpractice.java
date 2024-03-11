    public class finalpractice {
        private Listnode head;
        public static class  Listnode {
            int data;
            Listnode next;
            public  Listnode(int data){
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
        public void count(){
            Listnode current=head;
                int count=1;
                while(current.next!=null){
                    current=current.next;
                    count++;
                }
                System.out.println(count);
            
        }
        public void insertatfirst (int data){
            Listnode newnode=new Listnode(data);
            if(head==null){
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
            }
        }
        public void insertlast(int data){
            Listnode newnode=new Listnode(data);
            Listnode current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }

    
            // 1-->2-->3-->4-->5-->null  
            //      p   c
    public void insertatpos(int data,int position){
            Listnode newnode=new Listnode(data);
            Listnode prev=null;
            Listnode current=head;
            
            if(position==1){
                newnode.next=head;
                head=newnode;
            }
            else{
                for(int count=0;count<position-1;count++){
                    prev=current;
                    current=current.next;
                }
                prev.next=newnode;
                newnode.next=current;
            }
        }
        public void deletefirst(){
            Listnode temp=head;
            head=head.next;
            temp.next=null;
        }
        public void deletelast(){
            Listnode current=head;
            Listnode prev=null;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;
        }
        //// 1-->2-->3-->4-->5-->null  
        public Listnode deleteatpos(int position){
            if(position==1){
                Listnode temp=head;
                head=head.next;
                temp.next=null;
                return temp;
            } //   p    c
            //10-->15-->11-->12-->13-->null
            else{
            Listnode prev=head;
            for(int count=1;count<position-1;count++){
                prev=prev.next;
            }
            Listnode current=prev.next;
            prev.next=current.next;
            current.next=null;
            return current;
            }
        }
        public boolean search(int value){
            Listnode current=head;
            while(current!=null){
                if(current.data==value){
                    return true;
                }
                current=current.next;
            }
            return false;
        }
        //      p    c    n
        //10-->15-->12-->13-->null
        public void reverse(){
            Listnode prev=null;
            Listnode current=head;
            Listnode next=head;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head = prev;
        }
        public static void main(String[] args) {
            finalpractice sll=new finalpractice();
            sll.head=new Listnode(10);
            Listnode second=new Listnode(11);
            Listnode third=new Listnode(12);
            Listnode fourth=new Listnode(13);
            sll.head.next=second;
            second.next=third;
            third.next=fourth;
            sll.display();
            sll.count();
            sll.insertatfirst(9);
            sll.display();
            sll.insertlast(14);
            sll.display();
            sll.insertatpos(15,3);
            sll.display();
            sll.deletefirst();
            sll.display();
            sll.deletelast();
            sll.display();
            System.out.println(sll.deleteatpos(3).data);
            sll.display();
            // System.out.println(sll.search(11));
            sll.reverse(); 
            sll.display();
        
        }
    
    }
