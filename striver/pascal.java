import java.util.ArrayList;
import java.util.List;

public class pascal {

    public static void main(String[] args) {
        int n=5;
        List<List<Integer>>ans=pascals(n);
        for(List<Integer>it:ans){
            for(Integer ele:it){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> pascals(int n) {
                
        List<List<Integer>>ans=new ArrayList<>();
        for(int row=1;row<=n;row++){
            ans.add(generaterow(row));
        }
        return ans;
    }

    private static List<Integer> generaterow(int row) {
        List<Integer>ansrow=new ArrayList<>();
        int ans=1;
        ansrow.add(1);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansrow.add(ans);
        }
        return ansrow;
    }

}