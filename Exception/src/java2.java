import java.io.FileInputStream;
import java.io.IOException;

public class java2{

    public static void main(String[] args)throws IOException {
        FileInputStream fp=null;
        fp =new FileInputStream("E:/java.txt");
        int k;
        while((k=fp.read())!=-1){
            System.out.println((char)k);
        }
        fp.close();

    }
}