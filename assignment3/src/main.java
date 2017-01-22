/**
 * Created by Oscar on 2017-01-22.
 */
public class main {


    public static String mendStringsRecursive(String a, String b){
        if(a.length() == 1){
            return a+b;
        }
        if(b.length() == 1){
            return b+a;
        }
        return Character.toString(a.charAt(0)) + Character.toString(b.charAt(0)) + mendStringsRecursive(a.substring(1),b.substring(1));
    }


    public static String mendStrings(String a, String b){

        String[] mendedString = new String[a.length()+b.length()];

        int indexOfA = 0;
        int indexOfB = 0;

        for(int i = 0; i < mendedString.length; i++){
            if(indexOfA == a.length()){
                mendedString[i] = Character.toString(b.charAt(indexOfB));
                indexOfB++;
            }
            else if(indexOfB == b.length()){
                mendedString[i] = Character.toString(a.charAt(indexOfA));
                indexOfA++;
            }
            else{
                if(i % 2 == 0) {
                    if (indexOfA < a.length()) {
                        mendedString[i] = Character.toString(a.charAt(indexOfA));
                        indexOfA++;
                    }
                }
                if(i % 2 == 1) {
                    if (indexOfB < b.length()) {
                        mendedString[i] = Character.toString(b.charAt(indexOfB));
                        indexOfB++;
                    }
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i< mendedString.length; i++){
            if(mendedString[i] != null){
                stringBuilder.append(mendedString[i]);
            }
        }
        return stringBuilder.toString();



    }


    public static void main(String[] args){

        System.out.println(mendStrings("anna", "patrik"));

        System.out.println(mendStringsRecursive("anna","patrik"));

    }
}
