public class TilingProb {
    public static int tilingProb(int n){//2xn


        if(n==0||n==1){
            return 1;
        }

        int verticalTiles=tilingProb(n-1);
        int horizantalTiles=tilingProb(n-2);

        int totalWays=verticalTiles+horizantalTiles;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProb(2));
    }
}
