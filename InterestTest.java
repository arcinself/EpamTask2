import interest.Simple;
import interest.Compound;
import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*;
import java.util.*;
class InterestTest{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String args[]){
	Simple s=new Simple();
	Compound c=new Compound();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount:");
    double prin=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    int time=sc.nextInt();
    System. out. println("Enter the Rate of  interest");
    double rate=sc.nextDouble();
	LogManager lgmngr = LogManager.getLogManager();
    Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	double simple=s.simpleint(prin,rate,time);
	double compound=c.compoundint(prin,rate,time);
    log.log(Level.INFO,"Simple Interest="+simple);
	log.log(Level.INFO,"Compound Interest="+compound);
}
}