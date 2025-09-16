public class PrefixExample {
public static void main(String[] args){
int a=5, b=3;
// ++a is evaluated first (prefix increment has higher precedence than multiplication)
int result = ++a *b +2; //a becomes 6, then result = 6*3+2=20
System.out. println("Result: " + result);
}
}
