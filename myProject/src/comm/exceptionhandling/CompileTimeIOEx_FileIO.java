package comm.exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// compile time Exception : java.io.IOException

public class CompileTimeIOEx_FileIO {

	public static void main(String[] args) {
		//File f=new File("D:\\User\\Hello.txt");
		try {
			//f.createNewFile();
			FileReader fr=new FileReader("D:\\User\\Hello.txt");
			try{
				int n=fr.read();
				System.out.println(n);
				while(n!=-1) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}// InterruptedException
					System.out.print((char)n);
					n=fr.read();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
				
		} catch (IOException e) {
			System.out.println("From Catch");
			
			e.printStackTrace();
		}

	}

}
