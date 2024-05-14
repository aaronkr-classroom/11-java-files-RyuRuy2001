import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ex1207 {

	public static void main(String[] args) {
		File file = new File("members.txt");
		try {
			if(!file.exists())
				file.createNewFile();
		FileReader fr = new FileReader(file);
		// int i = 0;
		BufferedReader br = new BufferedReader(fr);
		String str;
		
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		fr.close();
		System.out.println("파일 읽기 성공!");
		
} catch(Exception e) {
	e.getMessage();
	}}
}
