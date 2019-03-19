/*

 *This class is to estimate the cost of constuction base on standard,area,requirement of automation.

 *

 */


package TASK_3;

public class estimate_construction {
	
	 /*

    standard can be (1,2,3) for (standard, above standard,high standard) respectively.

    area must be in terms of square feets

    automate accepts boolean values (true,false) for automation (required, not required) respectively.

    */
	
	 int standard;
	 int area;
	 boolean automate;
	
	//this constructor initialize the values of standard,area and automate.
	 
	estimate_construction(Standard standard , int area , boolean automate){
		
		this.standard=standard.getValue();
		this.area=area;
		this.automate=automate;
	}
	
	 /*

    this method cost() calculates the cost according to the given requirements and returns it.

  */
	
	public long cost() {
	
		int c = costPerSquareFeet();
		
		 //returns the cost
		
		return area*c;
		
	}
	
	 /*

	  this method costPerSquareFeet() returns the cost per one square feet as per the requirements

	  (standard,area,automate)

	  */
	
	public int costPerSquareFeet() {
		
		if(standard==1 && !automate)
		{

		      return 1200;

		}

		else if(standard==2 && !automate)
		{

		      return 1500;

		}

		else if(standard==3 && !automate)
		{

		      return 1800;

		}

		else if(standard==3 && automate)
		{

		      return 2500;

		}
		
	return costPerSquareFeet();		
	}

}
class Standard{

	  private int standard;

	  Standard(String str){

	    if(str.equalsIgnoreCase("standard")){

	      standard=1;

	    }

	    else if(str.equalsIgnoreCase("above standard")){

	      standard=2;

	    }

	    else if(str.equalsIgnoreCase("high standard")){

	      standard=3;

	    }

	  }

	  public int getValue(){

	    return standard;

	  }

	}