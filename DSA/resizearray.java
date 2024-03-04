public class resizearray{
    public static int[] resize(int arr[],int capacity){
        int temp[]=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int oroginal[]=new int [] {1,2,3,4};
        int capacity=8;
        System.out.println("the size of og array"+oroginal.length);
        oroginal=resize(oroginal, capacity);
        System.out.println("the size of new array"+oroginal.length);
    }
}
