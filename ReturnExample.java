public class ReturnExample{
public static void main(String[] args){
System.out.println("Start of program");
checkNumber(5);
System.out.println("End of program");
// Executes after checkNumber finishes(return only exits checkNumber,not main)
}
public static void checkNumber(int num){
 if(num<0){
System.out.println("Negative number");
return;// exits the method here
}
System.out.println("Positive number or zero");
}
}
