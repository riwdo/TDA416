import java.io.*;
import java.util.HashMap;

/**
 * Created by Surface pro 3 on 2017-01-19.
 */
public class main {


    public static void check(char s, BufferedReader br, OutputStreamWriter fileWriter, double total) throws IOException {
        int c;
        double count = 0;

        while((c = br.read()) != -1){
            if((char)c == s){
                count++;
            }
        }
        double frekvens = 0;
        if(count != 0){
            fileWriter.write(s + " ");
            frekvens = ((count/total)*100);
            frekvens = (double)Math.round((frekvens*100d)/100d);
            fileWriter.write(("   " +(int)count + "   " + frekvens + "%"));
            fileWriter.write("\n");

        }

    }

    public static double getCharacters(BufferedReader br) throws IOException{
        double count = 0;
        int c;
        while((c = br.read()) != -1){
            if(Character.isLetter((char)c)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {



        OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream("output.txt"),"Cp1252");
        fileWriter.flush();

        String alphabet = "abcdefghijklmnopqrstuvwxxyzåäö";
        fileWriter.write("Boks" + " "+ "Ant" + " " + "Frekv" + "\n");

        double total = getCharacters(new BufferedReader(new InputStreamReader(new FileInputStream("file.txt"))));

        for (int s = 0; s <= 29; ++s){
            check(alphabet.charAt(s), new BufferedReader(new InputStreamReader(new FileInputStream("file.txt"),"Cp1252")),fileWriter, total);
        }

        fileWriter.close();


    }
}
