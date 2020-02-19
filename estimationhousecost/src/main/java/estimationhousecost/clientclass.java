package estimationhousecost;

import java.io.*;
import estimationhousecost.concost;;

public class clientclass{
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int choice=0; double sqa=0,h=0; char yn;	
		System.out.println("Enter Your Choice Of Material Standard");
			System.out.println("Press 1 to use Standard Material\n"
							+ "Press 2 to use Above Standard material\n"
							+ "Press 3 to use High Standard material\n");
			choice=Integer.parseInt(in.readLine());
			System.out.println("Enter The Area of the house");
			sqa=Double.parseDouble(in.readLine());
			System.out.println("Enter 'y' if you want a fully automated house else 'n' if not");
			yn=(char)in.read();	
		
			h=concost.price(choice,sqa,yn);
			System.out.println("The House Cost Estimation is = "+h);
	}
}
