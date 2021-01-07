import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CheckedException{

    public static void main(String[] args) {
    	FileInputStream fp=null;
    	try {
			fp =new FileInputStream("E:/java.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int k;
        try {
			while((k=fp.read())!=1){
				System.out.println((char)k);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			fp.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}