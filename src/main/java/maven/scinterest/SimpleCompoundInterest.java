package maven.scinterest;
import java.util.*;

class SimpleCompoundInterest {
	SimpleCompoundInterest(double pricipleamount,double rateofinterest,int time)
	{
		double simpleinterest , compoundinterest;
		simpleinterest=(pricipleamount * time * rateofinterest)/100;
		compoundinterest=pricipleamount * Math.pow(1.0 + rateofinterest / 100.0 , time) - pricipleamount;
		
	}

}
