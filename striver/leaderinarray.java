/*
 Leaders in an Array


10

0
Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.

Examples
Example 1:
Input:

 arr = [4, 7, 1, 0]
Output
:
 7 1 0
Explanation:

 Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

Example 2:
Input:

 arr = [10, 22, 12, 3, 0, 6]
Output:

 22 12 6
Explanation:

 6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.
 */

import java.util.ArrayList;

public class leaderinarray {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     boolean leaders=true;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             leaders=false;
        //             break;
        //         }
        //     }
        //     if(leaders){
        //         ans.add(arr[i]);
        //     }
        // }

        int max=arr[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        for(int i=ans.size()-1;i>=0;i--){
            System.out.print(ans.get(i)+" ");
    }
}
}
