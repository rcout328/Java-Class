import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex_bufferreaderwriter {
    public static void main(String[] args)throws IOException {
        FileWriter write = new FileWriter("s.txt");
        BufferedWriter bout = new BufferedWriter(write);
        FileReader fr = new FileReader("s.txt");
        BufferedReader br = new BufferedReader(fr);

        String s = "hello";
        bout.write(s);
        bout.close();

        String line = br.readLine();
        System.out.println(line);
        

        while((line = br.line())!=null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}


//ex_bufferreaderwriter.java