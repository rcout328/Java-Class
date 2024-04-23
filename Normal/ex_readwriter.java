import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex_readwriter {
    public static void main(String[] args)throws IOException {
        FileWriter writer = new FileWriter("ix.txt");
        FileReader reader = new FileReader("ix.txt");

        String s = "Ip2 Is going to end";
        String s1 = "\nIp3 Is going to end";
        writer.write(s);
        writer.write(s1);
        int i = 0;
        while((i=reader.read())!=-1){
            System.out.println((char)i);
        }
        writer.close();
    }
}
