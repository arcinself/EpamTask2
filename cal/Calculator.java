package cal;
import java.util.*;
public class Calculator{
	//TO PERFORM ADDITION OF TWO NUMBERS
	public double add(double a,double b){
		return a+b;
	}
	//TO PERFORM MULTIPLICATION OF TWO NUMBERS
	public double mul(double a,double b){
		return a*b;
	}
	//TO PERFORM DIVISION OF TWO NUMBERS
	public double div(double a,double b){
		if(b==0)
			return Integer.MAX_VALUE;
		return a/b;
	}
}