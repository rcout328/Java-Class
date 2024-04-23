import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo_charcount {
    public static void main(String[] args)throws IOException {
        FileReader fread = new FileReader("ix.txt");
        BufferedReader bread = new BufferedReader(fread);
        int wordcount = 0;
        int linecount = 0;
        int charcount = 0;

        String line = "";

        while((line = bread.readLine())!=null){
           linecount++;
           String words[] = line.split("");
            wordcount = wordcount + words.length;

           for(int i=0;i<words.length;i++){
            charcount = charcount + words[i].length();
             

           }
           System.out.println(line);
        }
        System.out.println("Lines" + linecount);
        System.out.println("Words" + wordcount);
        System.out.println("Char" + charcount);
    }


}
