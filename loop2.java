import java.util.*;
public class loop2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n=0;
        for(int i=0;i<a;i++){
            int b1 = scan.nextInt();
            int b2 = scan.nextInt();
            int b3 = scan.nextInt();
            int b = b1+b2;
            int c = b;
            System.out.printf(""+b);
            while(n<(b3-1)){
                c = c + (2^n)*b2;
                n=n+1;
                System.out.printf(" "+c);
            }
            System.out.printf("%n");
        }
        scan.close();
    }
}
