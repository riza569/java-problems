import java.util.LinkedList;
import java.util.Queue;

public class Binarydigit {
    public static String[] binary(int n){

        Queue <String>q=new LinkedList<>();
        String res[]=new String[n];
        q.offer("1");
        for(int i=0;i<n;i++){
            res[i]=q.poll();
            String n1=res[i]+"0";
            String n2=res[i]+"1";
            q.offer(n1);
            q.offer(n2);

    }
    return res;
    }
    public static void main(String[] args) {
        int n=8;
        String[] res=binary(n);
        for(String x:res){
            System.out.print(x+" ");
        }
    }
}

