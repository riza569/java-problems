public class tiles {
    public static int tilescount(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horizontal=tilescount(n-1, m);
        int vertical=tilescount(n-m, m);
        return horizontal+vertical;

    }
    public static void main(String[] args) {
        System.out.println(tilescount(6, 3));
    }
}
