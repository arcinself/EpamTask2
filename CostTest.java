import cost.Cost;
import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*;
import java.util.*;
class CostTest{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String args[]){
	Cost c=new Cost();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter \n0 for Normal Standard.\n\n1 for Above Normal Standard.\n\n2 for High Standard.\n");
	System.out.println("Enter the standard you want in the construction of house:");
    int standard=sc.nextInt();
    System. out. println("Enter the area:");
    double area=sc.nextDouble();
    System. out. println("Specify whether you want it automated in true or false.");
    boolean automated=sc.nextBoolean();
	LogManager lgmngr = LogManager.getLogManager();
    Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	double cost=c.costcal(standard,area,automated);
    log.log(Level.INFO,"Cost="+cost);
}
}