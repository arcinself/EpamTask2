import cal.Calculator;
import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*;
import java.util.*;
class CalculatorTest{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String args[]){
	Calculator c=new Calculator();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	double a=sc.nextInt();
	double b=sc.nextInt();
	LogManager lgmngr = LogManager.getLogManager();
    Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME); 
    log.log(Level.INFO,"Addition:"+c.add(a,b));
	log.log(Level.INFO,"Multiplication:"+c.mul(a,b));
	log.log(Level.INFO,"Division:"+c.div(a,b));
}
}