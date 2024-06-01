import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class majority3 {
    public static void main(String[] args) {
        int arr[]={11,33,33,11,33,11};
        List<Integer>ans=new ArrayList<>();
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     if(ans.size()==0||ans.get(0)!=arr[i]){
        //     int cnt=1;
        //     for(int j=i;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt>n/3){
        //      ans.add(arr[i]);
        //     }
        // }
        // if(ans.size()==2){
        //     break;
        // }

        // }
        // for(int x:ans){
        //     System.out.print(x+" ");
        // }





        //2nd approach
    //     HashMap<Integer,Integer>hm=new HashMap<>();
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        
    //         if(hm.get(arr[i])>n/3){
    //             ans.add(arr[i]);
    //     }
    //     if(ans.size()==2){
    //         break;
    //     }
    // }
    //     for(int it:ans){
    //         System.out.print(it+" ");
    //     }


    //optimal approach
    //extended boyer moores voting algo
    int cnt1=0,cnt2=0;
    int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(cnt1==0&&arr[i]!=ele2){
            cnt1=1;
            ele1=arr[i];
        }
        else if(cnt2==0&&arr[i]!=ele1){
            cnt2=1;
            ele2=arr[i];
        }
        else if(ele1==arr[i]){
            cnt1++;
        }
        else if(ele2==arr[i]){
            cnt2++;
        }
        else{
            cnt1--;
            cnt2--;
        }
    }
    List<Integer>res=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(arr[i]==ele1)cnt1++;
        if(arr[i]==ele2)cnt2++;
    }
    int mini=(int)(n/3)+1;
    if(cnt1>=mini)res.add(ele1);
    if(cnt2>=mini)res.add(ele2);

    for(int x:res){
        System.out.print(x+" ");
    }
    }
}

