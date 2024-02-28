import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        /*
        1 2 3 4 
        1 2 3
        1 2
        1
         */
        

        // int number=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }
        
        
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10

    //    for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if((i+j)%2==0){
    //             System.out.print(1+" ");
    //         }else{
    //             System.out.print(0+" ");
    //         }
    //     }
    //     System.out.println();
    //    }
        /*
            1 
            0 1
            1 0 1
            0 1 0 1
         */

    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=i;j>1;j--){
    //             System.out.print(j);
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }

    //      1
    //     212
    //    32123
    //   4321234

    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //    *****
    //     *****
    //      *****
    //       *****
    //        *****

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=i;j>1;j--){
    //         System.out.print("*");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=i;j>1;j--){
    //         System.out.print("*");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
            /*     
     *
    ***
   *****
  *******
 *********
***********
***********
 *********
  *******
   *****
    ***
     *
     
     */

    //  for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     int spaces=2*(n-i);
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }
    //  for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     int spaces=2*(n-i);
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }
     /*

      *      *
      **    **
      ***  ***
      ********
      ********
      ***  ***
      **    **
      *      *
      
      */

    //   for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //   }

    /* 
********
********
********
********
********
********
********
******** */


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        /* 
    *
   **
  ***
 ****
***** 

*/

            // for(int i=1;i<n;i++){
            //     for(int j=1;j<=n-i+1;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(int i=n;i>=1;i--){
            //     for(int j=1;j<=n-i+1;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            /*
*****
****
***
**
*
**
***
****
***** 

*/

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<i;j++){
            //         System.out.print(" ");
            //     }
              
            //     for(int j=i;j<=n;j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }

            /*
1 2 3 4 5 
 2 3 4 5
  3 4 5
   4 5
    5 
        
    
    
    */

            // for(int i=1;i<n;i++){
            //     for(int j=1;j<i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=i;j<=n;j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }
            // for(int i=n;i>=1;i--){
            //     for(int j=1;j<i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=i;j<=n;j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }

            /*
1 2 3 4 
 2 3 4
  3 4
   4
  3 4
 2 3 4
1 2 3 4 

*/


// for (int i = 1; i <= n; i++) {
           
//     for (int j = 1; j <=n-i; j++) {
//         System.out.print(" ");
//     }
   
//     for (int j = 1; j <= (2 * i - 1); j++) {
//         if (j == 1 || i == n || j == (2 * i - 1)) {
//             System.out.print("*");
//         }
//         else {
//             System.out.print(" ");
//         }
//     }

//     System.out.println("");
//         }
  


/*     *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
*************** 

*/


    // for(int i=n;i>=1;i--){
    //     for(int j=i;j<n;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=(2*i-1);j++){
    //         if(i==n||j==2*i-1||j==1){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }
            /*
*********
 *     *
  *   *
   * *
    *
    
    */

   

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
    
//     }
//     for(int j=1;j<=(2*i-1);j++){

//         if(j==1||j==2*i-1){
//         System.out.print("*");
//     }

//     else{
//         System.out.print(" ");
//     }  }
//     System.out.println();
// }


// for(int i=n-1;i>=1;i--){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
    
//     }
//     for(int j=1;j<=2*i-1;j++){
//         if(j==1||j==2*i-1){
//         System.out.print("*");}
//         else{
//             System.out.print(" ");
//         }
//     }
    
//     System.out.println();
// }

/* 
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/


// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n+1-i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

/*

*****
****
***
**
* 

*/
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n+1-i;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }

/*
 * * * * * 
  * * * *
   * * *
    * *
     *
 */

//  for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//  }
//  for(int i=1;i<n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//  }

/*

*
**
***
****
*****
****
***
**
* 

*/

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=n-1;i>=1;i--){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


/*

*
**
***
 ****
*****
 ****
 ***
 **
 *
 
 
 */


//  for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
//  }
//  for(int i=n-1;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n-i+1;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
//  }

/*

 * * * * * 
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *
 
     
 */

// for(int i=1;i<=n+1;i++){
//     for(int j=1;j<=(n+1)/2;j++){
//         if((j==1||j==(n+1)/2)&&i!=1 || i==1 && j!=(n+1)/2||i==(n+1)/2){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

/*

** 
* *
***
* *
* *
* *

 */


//  for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=2*i-1;j++){
//         if(j==1||j==2*i-1||i==n){
//         System.out.print("*");}
//         else{
//             System.out.print(" ");
//         }

//     }
//     System.out.println();
//  }

/*
         *
        * *
       *   *
      *     *
     *       *
    *         *
   *           *
  *             *
 *               *
*******************

 */




    //     for(int i=n;i>=1;i--){
    //     for(int j=i;j<n;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=(2*i-1);j++){
    //         if(i==n||j==2*i-1||j==1){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }}}


    /*
      5
*********
 *     *
  *   *
   * *
    *
     */

    
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=(2*i-1);j++){
    //         if(j==1||j==2*i-1){
    //         System.out.print("*");
    //     }
    //     else{
    //         System.out.print(" ");

    //     }}
    //     System.out.println();
    // }
    // for(int i=n-1;i>=1;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=(2*i-1);j++){
    //         if(j==1||j==2*i-1){
    //         System.out.print("*");
    //     }
    //     else{
    //         System.out.print(" ");

    //     }}
    //     System.out.println();
    // }

    /* 
     
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

    */


    /* pascals triangle */

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     int number=1;
    //     for(int j=1;j<=i;j++){
    //         System.out.print(number+" ");
    //         number=number*(i-j)/j;
    //     }
    //     System.out.println();
    // }
    // }}

    /*
    1 
   1 1
  1 2 1 
 1 3 3 1
1 4 6 4 1
     */

    //     for(int i=0;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=i;j>1;j--){
    //             System.out.print(j);
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    //     for(int i=n-1;i>=1;i--){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=i;j>1;j--){
    //             System.out.print(j);
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }


    //      1
    //     212
    //    32123
    //   4321234
    //    32123
    //     212
    //      1



//     for(int i=n;i>=1;i--){
//         for(int j=n;j>=i;j--){
//             System.out.print(j);
//         }
//         System.out.println();
//     }


// 5
// 54
// 543
// 5432
// 54321


// for(int i=1;i<=n;i++){
//     for(int j=i;j>=1;j--){
//         System.out.print(j+" ");
//     }
//     System.out.println();
// }

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         int sum=i+j;
    //         if(sum%2==0){
    //             System.out.print("1");
    //         }
    //         else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    //     }


// 10101
// 01010
// 10101
// 01010
// 10101

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         if(j%2==1||j==1){
//             System.out.print("1");
//         }
//         else{
//             System.out.print("0");
//         }
//     }
//     System.out.println();
// }
//     }}

//     1
//     10
//     101
//     1010
//     10101
//     101010
//     1010101
//     10101010
//     101010101
//     1010101010

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=i;j<=n;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }
    // for(int i=n-1;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=i;j<=n;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }
    // }}



//    1 2 3 4 5 
//     2 3 4 5
//      3 4 5
//       4 5
//        5
//       4 5
//      3 4 5 
//     2 3 4 5
//    1 2 3 4 5




//         int alphabet=65;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(alphabet+j-1)+" ");
//             }
//             System.out.println();
//         }

//         5
// A 
// A B
// A B C
// A B C D
// A B C D E






    // int alphabet=65;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print((char)(alphabet+i-1)+" ");
    //     }
    //     System.out.println();
    // }


// A 
// B B
// C C C
// D D D D
// E E E E E



// int alphabet=65;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print((char)(alphabet+j-1)+" ");
//     }
//     System.out.println();
// }
// for(int i=n;i>=1;i--){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print((char)(alphabet+j-1)+" ");
//     }
//     System.out.println();
// }
// A B C D E 
// A B C D
// A B C
// A B
// A
// A
// A B
// A B C
// A B C D
// A B C D E

// int al=65;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print((char)(al+j-1)+" ");
//     }
//     System.out.println();
// }

    int alphabet=65;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){
            if(j==1||j==2*i-1){
            System.out.print((char)(alphabet+i-1));
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for(int i=n-1;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){
            if(j==1||j==2*i-1){
            System.out.print((char)(alphabet+i-1));
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }



    }}