public class missingnumber3 {
    public static void main(String[] args) {
        int a[]={1,3,4,2,5,7};
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < a.length; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ a.length+1; //XOR up to [1...N]
        System.out.println(xor1^xor2);
    }
}
