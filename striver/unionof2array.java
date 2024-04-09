import java.util.ArrayList;

public class unionof2array {
    public static void main(String[] args) {
        
    
    int arr1[]={1,2,3,4,5};
    int arr2[]={2,3,4,4,5,7,8};
    int i=0;
    int j=0;
    ArrayList<Integer>ar=new ArrayList<>();
    while(i<arr1.length&&j<arr2.length){
        if(arr1[i]>=arr2[j]){
            if(ar.size()==0||ar.get(ar.size()-1)!=arr2[j])
                ar.add(arr2[j]);
                j++;
    }
        else
        {
        if(ar.size()==0||ar.get(ar.size()-1)!=arr1[i])
            ar.add(arr1[i]);
            i++;
    }
   
}
while(i<arr1.length){
    if (ar.get(ar.size()-1) != arr1[i])
      ar.add(arr1[i]);
      i++;
}
while(j<arr2.length){
    if (ar.get(ar.size()-1) != arr2[j])
    ar.add(arr2[j]);
    j++;
}
    for(int x:ar)
    System.out.print(x+" ");
}
}