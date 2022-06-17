import java.util.*;

public class try2 {
    public static double add(double a, double b){
        double c = a+b;
        return c;
    }
    public static double divide(double a, double b){
        double d = a/b;
        return d;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        scan.close();
        double res1 = add(a,b);
        System.out.println("The sum of "+a+" and "+b+" is equals to: "+res1);
        double res2 = divide(a,b);
        System.out.println("The division of "+a+" and "+b+" is equals to: "+res2);
    }
}
