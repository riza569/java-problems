public class unionof2array {
    public static void main(String[] args) {
        
    
    int arr1[]={1,2,3,4,5};
    int arr2[]={2,3,4,4,5,7,8};
    int i=0;
    int j=0;
    while(i<arr1.length&&j<arr2.length){
    if(arr1[i]>arr2[j]){
        System.out.print(arr2[j++]+" ");
    }
    else if(arr1[i]<arr2[j]){
        System.out.print(arr1[i++]+" ");
    }
    else{
        
        j++;
    }

}
while(i<arr1.length){
    System.out.print(arr1[i++]+" ");
}
while(j<arr2.length){
    System.out.print(arr2[j++]+" ");
}
    
}
}