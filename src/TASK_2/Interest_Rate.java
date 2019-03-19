/*

* this class Interest can calculaltes simple interest and compound interest

*/


package TASK_2;

public class Interest_Rate {
	public double simple_interest(double pr,double t, double r)
	{
		//this method simple interest calculates the simple interest using simple interest formula
		double simple_interest = (pr*t*r)/100;
		return simple_interest;
	}
	
	public double compound_interest(double pr,double t,double r)
	{
		 //this method compound interest calculates the compound interest using compound interest formula
		double compound_interest=( pr *(Math.pow((1 + r / 100) , t)));
		return compound_interest;
	}
	
}
