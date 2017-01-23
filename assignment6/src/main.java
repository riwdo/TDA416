/**
 * Created by Oscar on 2017-01-22.
 */
public class main {


    public static int BinomialC(int n, int k){
        if(k < 0 || n < k){
            return 0;
        }else if(k == 0 || n== k){
            return 1;
        }else {
            return BinomialC(n-1,k-1) + BinomialC(n-1,k);
        }
    }

    public static void main(String[] args){
        System.out.println(BinomialC(4,1));
    }

}
