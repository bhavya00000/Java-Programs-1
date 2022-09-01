// Maximum of three Number 

import java.util.*;
public class maxOfNum {
    public static void main (String args[]){
        System.out.println("Enter first Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();

        // Using ternery operator
        int d = (a>b&&a>c)?a:(b>c&&b>a)?b:c;
		System.out.println("The number is :"+d);

        // Using if else 
        if(a>b&&a>c){
            System.out.println(a+" is the highest number");
        }else if (b>a&&b>c) {
            System.out.println(b+" is the highest number");
        }else{
            System.out.println(c+" is the highest number");
        }
        sc.close();
    }
} 
