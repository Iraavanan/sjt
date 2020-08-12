import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine(); 
		//sb.append(str);
		Controller c = new Controller();
		c.setImage(str);
		//View v = new View();
		//v.publish();
		
	}

}
