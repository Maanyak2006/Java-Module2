public class BitwiseNotExample{
public static void main(String[] args){
int a=5;// Binary:0000 0101
int result =(~a+1)*2;
//~a= bitwise NOT of 5=-6
//“a+1=-5
// result =-5*2=-10
System.out.println("Result:" + result);
}
}
