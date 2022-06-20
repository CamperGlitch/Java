import java.util.*;
public class loop2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i=0;i<x;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int s = a;
            for(int j=0;j<n;j++){
                s += Math.pow(2,j)*b;
                System.out.printf(""+s+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
