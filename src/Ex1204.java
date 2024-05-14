import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex1204 {

	public static void main(String[] args) {
		File file = new File("members.txt");
		
		try {
			
			FileWriter fw = new FileWriter(file);
			Scanner input = new Scanner(System.in);
			
			boolean quit = false;
			while (!quit) {
				
				System.out.print("아이디: ");
				String uid = input.next();
				fw.write("아이디: " + uid + " ");
								
				System.out.print("이름: ");
				String uname = input.next();
				fw.write("이름: " + uname + "\n");
				
				System.out.print("계속 진행? Y | N ");
				String str = input.next();

				if (str.toUpperCase().equals("N"))
					quit = true;
			}
			fw.close();
			System.out.println("파일 쓰기 성공!");
			
		} catch(Exception e) {
			e.getMessage();

		}
	}
}