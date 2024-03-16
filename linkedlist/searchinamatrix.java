public class searchinamatrix {
    public static void main(String[] args) {
        
        int arr[][]={{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,51}};
        int key=10;
        int n=4;
        int i=0;
        int j=n-1;
        while(i<n&&j>=0){
            if(arr[i][j]==key){
                System.out.println("found");
                return;
            }
            if(arr[i][j]>key){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("not found");

    }
}
