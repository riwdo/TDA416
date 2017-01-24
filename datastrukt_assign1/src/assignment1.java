

/**
 * Created by Surface pro 3 on 2017-01-19.
 */
public class assignment1 {


    public static void incrementIndex(int[] array, int number, int index) {
        int tmp = array[index];
        array[index] = number;
        for (int i = 0; i < array.length; i++) {
            if(i != array.length -1) {
                if (i >= index) {
                    int tmp2 = array[i + 1];
                    array[i + 1] = tmp;
                    tmp = tmp2;
                }
            }
        }
    }

    public static void main(String[] args){

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        incrementIndex(array, 2, 0);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }




    }
}
