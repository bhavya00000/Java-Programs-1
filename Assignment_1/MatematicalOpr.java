import java.util.*;
public class MatematicalOpr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println(("Enter second number : "));
        int b = sc.nextInt();
        int c=a+b;
        System.out.println("The Summation of number is : "+c);
        int d=a-b;
        System.out.println("The difference of number is : "+d);
        int e=a*b;
        System.out.println("The multiplication of number is :"+e);
        int f=a/b;
        System.out.println("The division of number is :"+f);
        int g=a%b;
        System.out.println("The modulus of two number is : "+g);
        sc.close();
    }
}
