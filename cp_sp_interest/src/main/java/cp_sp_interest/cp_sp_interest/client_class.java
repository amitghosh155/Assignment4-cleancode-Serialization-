package cp_sp_interest.cp_sp_interest;
import java.io.*;

import cp_sp_interest.cp_sp_interest.cpspint;

public class client_class {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		double p,r,t,s,c;
		System.out.println("Enter the Principal amount");
		p=Double.parseDouble(in.readLine());
		System.out.println("Enter the Rate of interest");
		r=Double.parseDouble(in.readLine());
		System.out.println("Enter the Time duration in Years");
		t=Double.parseDouble(in.readLine());
		cpspint ob=new cpspint();
		s=ob.simpleinterest(p,r,t);
		c=ob.compoundinterest(p,r,t);
		System.out.println("The Compound Interest is = "+c);
		System.out.println("The Simple Interest is = "+s);
		
	}

}
