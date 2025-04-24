package learningjavaforselenium.lectureContent;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileHandling {
	
	public void readDataCharcterbyCharcter(String Path) throws IOException {
		File f = new File(Path);
		FileReader fr = new FileReader(f);
		int a;
		while ((a=fr.read())!=-1) 
		{
			System.out.print((char)a);
		}
		fr.close();
	}
	
	public static void main(String[] args) throws IOException {
		FileHandling f = new FileHandling();
		f.readDataCharcterbyCharcter("../learningJavaforSelenium/TestFile.txt");
	}
	
}
