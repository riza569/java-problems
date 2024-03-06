public class unionoftwosorted {
    public static void main(String[] args) {
     int i=0,j=0;
     int arrray1[]={1,2,3,4,5};
     int arrray2[]={2,3,5,7,9};
     while(i<arrray1.length && j<arrray2.length){

        if(arrray1[i]<arrray2[j]){
            System.out.print(arrray1[i++]+" ");
        }
        else if(arrray2[j]<arrray1[i]){
            System.out.print(arrray2[j++]+" ");
        }
        else{
            System.out.print(arrray2[j++]+" ");
            i++;
        }
     }
     while(i<arrray1.length){
        System.out.print(arrray1[i++]+" ");
     }
     while(j<arrray2.length){
        System.out.print(arrray2[j++]+" ");
     }

    }
}
