package cp_sp_interest.cp_sp_interest;
public class cpspint {

	public double simpleinterest(double p, double r, double t) {
		// TODO Auto-generated method stub
		double a=1+r/100;
		double b=p*(Math.pow(a,t));
		double q=b-p;
		return(q);
	}


	public double compoundinterest(double p, double r, double t) {
		// TODO Auto-generated method stub
		double x=(p*r*t)/100;
		return(x);
	}
	
}
