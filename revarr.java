import java.util.*;

public class revarr {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = scan.nextInt();
        }
        for(int j=x;j>0;j--){System.out.printf(""+arr[j-1]);}
        scan.close();
    }
}
