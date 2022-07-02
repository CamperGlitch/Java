import java.util.*;

public class Strpalin {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int x = A.length();
        String a = "";
        while(x>0){
            a = a + A.substring(x-1,x);
            x=x-1;
        }
        if(a.equals(A)){
            System.out.println("Yes: "+a);
        }
        else{System.out.println("No: "+a);}
        sc.close();
    }
}
