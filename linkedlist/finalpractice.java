import java.util.List;

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
            if(head==null){
                head=newnode;
                return;
            }
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
        public void middle(){
            Listnode fastptr=head;
            Listnode slowptr=head;
            while(fastptr!=null&&fastptr.next!=null){
                fastptr=fastptr.next.next;
                slowptr=slowptr.next;
            }
            System.out.println(slowptr.data);
        }
        //13-->12-->15-->10-->null
        public void nthnode(int position){
            Listnode faststptr=head;
            Listnode slowptr=head;
            int count=0;
            while(count<position){
                faststptr=faststptr.next;
                count++;
            }
            while(faststptr!=null){
                faststptr=faststptr.next;
                slowptr=slowptr.next;
            }
            System.out.println(slowptr.data);
        }
        public void removeduplicate(){
            Listnode current=head;
            while(current!=null&&current.next!=null){
                if(current.data==current.next.data){
                    current.next=current.next.next;
                }
                else{
                current=current.next;
            }}
        }
        //1-->2-->3-->5-->null
        public void insertnodesorted(int data){
            Listnode newnode=new Listnode(data);
            if(head==null){
                head=newnode;;
            }
            Listnode current=head;
            Listnode temp=null;
            while(current!=null&&current.data < newnode.data){
                temp=current;
                current=current.next;
            }
            newnode.next=current;
            temp.next=newnode;
        }
        public void removebykey(int value){
            Listnode current=head;
            Listnode prev=null;
            if(value==head.data){
                head=current.next;
            }
            else{
            while(current!=null){
                if(current.data==value){
                    prev.next=current.next;
                }
                prev=current;
                current=current.next;
            }}
        }
        public boolean detectloop(){
            Listnode fastptr=head;
            Listnode slowptr=head;
            while(fastptr!=null && fastptr.next!=null){
                fastptr=fastptr.next.next;
                slowptr=slowptr.next;
                if(fastptr==slowptr)
                return true;
            }
            return false;
        }
            public static Listnode mergetwosortedll(Listnode a,Listnode b){
                Listnode dummy=new Listnode(1);
                Listnode tail=dummy;
                while(a!=null&&b!=null){
                    if(a.data<b.data){
                        tail.next=a;
                        a=a.next;
                    }
                    else{
                        tail.next=b;
                        b=b.next;
                    }
                    tail=tail.next;
                }
                if(a==null){
                    tail.next=b;
                }
                else{
                    tail.next=a;
                }
                return dummy.next;
            }
            
            public static Listnode add(Listnode a,Listnode b){
                Listnode dummy=new Listnode(11);
                Listnode tail=dummy;
                int carry=0;
                while(a!=null || b!=null){
                    int x=a!=null?a.data:0;
                    int y=b!=null?b.data:0;
                    int sum=carry+x+y;
                    carry=sum/10;
                    tail.next=new Listnode(sum%10);
                    tail=tail.next;
                    if(a!=null)
                    a=a.next;
                    if(b!=null)
                    b=b.next;
                }
                if(carry>0){
                    tail.next=new Listnode(carry);
                }
                return dummy.next;
            }
        public static void main(String[] args) {
            finalpractice sll1=new finalpractice(); 
            finalpractice sll2=new finalpractice(); 
            // sll.head=new Listnode(10);
            // Listnode second=new Listnode(11);
            // Listnode third=new Listnode(12);
            // Listnode fourth=new Listnode(13);
            // sll.head.next=second;
            // second.next=third;
            // third.next=fourth;
            
            // sll.display();
            // sll.count();
            // sll.insertatfirst(9);
            // sll.display();
            // sll.insertlast(14);
            // sll.display();
            // sll.insertatpos(15,3);
            // sll.display();
            // sll.deletefirst();
            // sll.display();
            // sll.deletelast();
            // sll.display();
            // System.out.println(sll.deleteatpos(3).data);
            // sll.display();
            // // System.out.println(sll.search(11));
            // // sll.reverse(); 
            // sll.display();
            // sll.middle();
            // sll.nthnode(2);
            // sll.insertatfirst(10);
            // sll.display();
            // sll.removeduplicate();
            // sll.display();
            // sll.insertatpos(15, 3);
            // sll.display();
            // sll.removeduplicate();
            // sll.display();
            // sll.insertnodesorted(14);
            // sll.display();
            // sll.removebykey(15);
            // sll.display();
            // System.out.println(sll.detectloop());
            
            sll1.insertlast(1);
            sll1.insertlast(4);
            sll1.insertlast(8);
            sll1.display();
            sll2.insertlast(3);
            sll2.insertlast(5);
            sll2.insertlast(9);
            sll2.insertlast(19);
            sll2.display();
            finalpractice res=new finalpractice();
            res.head=add(sll1.head,sll2.head);
            res.display();
            
            



        }
    
    }
