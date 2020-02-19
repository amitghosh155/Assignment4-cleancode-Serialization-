package estimationhousecost;

public class concost{
	public static double price(int choice, double sqa, char yn) {
		// TODO Auto-generated method stub
		double cost=0;
		if(yn=='n')
		{
			if(choice==1)
				cost=sqa*1200;
			else if(choice==2)
				cost=sqa*1500;
			else if(choice==3)
				cost=sqa*1800;
		}
		else if(yn=='y')
		{
			cost=sqa*2500;
		}
			
			return(cost);
	}

}
