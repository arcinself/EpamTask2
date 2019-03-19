package cost;
import java.util.*;
public class Cost{
	public double costcal(int standard,double area,boolean automated){
	double cost=0;
	if(standard==0){
	cost=1200*area;
	}
	else if(standard==1){
	cost=1500*area;
	}
	else if(standard==2){
	cost=1800*area;
	}
	else if(standard==2 && automated){
	cost=2500*area;
	}
	return cost;
	}
}