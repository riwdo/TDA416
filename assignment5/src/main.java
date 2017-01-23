/**
 * Created by Oscar on 2017-01-23.
 */


public class main {
    private static int[] array;


    public static long random(int min, int max){

        return (System.currentTimeMillis()%max)+min;
    }


    public static void main(String[] args){

        int min = 0;
        int max = 10;
        int total = 10000000;

        array = new int[max];
        for(int i= 0; i < max; i++){
            array[i] = 0;
        }


        for(int i = 0; i < total; i++){
            int random = (int)random(0,10);
            array[random]++;
        }

        for(int i = min; i < max; i++){
            System.out.println(array[i] + " " + ((double)array[i]/total)*100 + "%");
        }

    }


}
