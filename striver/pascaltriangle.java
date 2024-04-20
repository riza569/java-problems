public class pascaltriangle {
    public static void main(String[] args) {
        int r=5;
        int c=3;
        int ele=pascaltriangles(r,c);
        System.out.println(ele);
    }

    private static int pascaltriangles(int r, int c) {
        int ele=ncr(r-1,c-1);
        return ele;
    }

    private static int ncr(int n, int c) {
        int res=1;
        for(int i=0;i<c;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}
