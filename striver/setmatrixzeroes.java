public class setmatrixzeroes {
    public static void main(String[] args) {

    //brute force o(n*m) + 0(n*m) +0(n) + o(m)
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        int n=arr[0].length;
        int m=arr.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(arr[i][j]==0){
    //                 markrow(arr,i,n,m);
    //                 markcol(arr,j,n,m);
    //             }
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(arr[i][j]==-1){
    //                 arr[i][j]=0;
    //             }
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             System.out.print(arr[i][j]+" ");

    //         }
    //         System.out.println();
    //     }
        

    // }

    // private static void markcol(int[][] arr, int j, int n, int m) {
    //     for(int i=0;i<n;i++){
    //         if(arr[i][j]!=0){
    //             arr[i][j]=-1;
    //         }
    //     }
    // }

    // private static void markrow(int[][] arr, int i, int n, int m) {
    //     for(int j=0;j<m;j++){
    //         if(arr[i][j]!=0){
    //             arr[i][j]=-1;
    //         }
    //     }
    // }

        //better approach we will use 2 array of size row and col
        // int row[]=new int[n];
        // int col[]=new int[m];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //          if(arr[i][j]==0){
        //             row[i]=1;
        //             col[j]=1;
        //          }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(row[i]==1||col[j]==1){
        //             arr[i][j]=0;
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //             for(int j=0;j<m;j++){
        //                 System.out.print(arr[i][j]+" ");
        
        //             }
        //             System.out.println();
        //         }


        //optimal approach 
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]!=0){
                    if(arr[i][0]==0||arr[0][j]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        if(arr[0][0]==0){
            for(int j=1;j<m;j++){
                arr[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


}
}
