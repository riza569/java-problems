/*
 Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K.

Examples:  

Input: arr[] = {1, 5, 7, -1}, K = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
 */

public class countpairs {
    public static void main(String []args){
    int arr[]={1,2,3,4,5,2,-1};
    int k=4;
    int count=0;
    for(int j=0;j<arr.length;j++){
        for(int i=j+1;i<arr.length;i++){
            if(arr[j]+arr[i]==k){
                count++;
            }
        }
    }
    System.out.println(count);

    }
}
