import java.util.ArrayList;

public class subset {
    public static void subsets(ArrayList<Integer>v,int i,ArrayList<Integer>subset,ArrayList<ArrayList<Integer>>answer){

        if(i==v.size()){
            answer.add(new ArrayList<>(subset));
            return;
        }

        subset.add(v.get(i));
        subsets(v, i+1, subset, answer);
        subset.remove(subset.size()-1);
        subsets(v, i+1, subset, answer);

    }
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
    ArrayList<Integer>v=new ArrayList<>();
    v.add(1);
    v.add(2);
    v.add(3);
    ArrayList<Integer>subset=new ArrayList<>();
    subsets(v,0,subset,answer);
    for (ArrayList<Integer> sub : answer) {
        System.out.println(sub);
    }  }
}
