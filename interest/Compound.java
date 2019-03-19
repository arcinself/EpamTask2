package interest;
public class Compound
{
public double compoundint(double prin,double rate,int time){
    return prin * Math.pow(1.0+rate/100.0,time) - prin;
   }
}