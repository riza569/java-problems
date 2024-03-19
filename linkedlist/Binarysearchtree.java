import java.util.Stack;

public class Binarysearchtree {
     public static void main(String[] args) {
        int array[][]={{10,20,30,40},
                        {33,44,55,66},
                    {17,33,66,11},
                    {22,44,66,88}};
                    int n=array.length;
                    int m=array[0].length;
                    int top=0,right=m-1;
                    int bottom=n-1,left=0;
                    while(top<=bottom && left<=right){
                    for(int i=left;i<=right;i++){
                        System.out.print(array[top][i]+" ");
                    }

                    top++;

                    for(int i=top;i<=bottom;i++){
                        System.out.print(array[i][right]+" ");
                    }

                    right--;

                    if(top<=bottom){
                    for(int i=right;i>=left;i--){
                        System.out.print(array[bottom][i]+" ");
                    }
                    bottom--;
                    }

                    if(left<=right){
                    for(int i=bottom;i>=top;i--){
                        System.out.print(array[i][left]+" ");
                    }
                    left++;
                }

            }
        }    
    }  


