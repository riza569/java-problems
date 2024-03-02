public class mae {
    public static int maze(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downpath=maze(i+1, j, n, m);
        int rightpath=maze(i, j+1, n, m);
        return downpath+rightpath;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(maze(0, 0, n, m));
    }
}
