import java.util.*;
public class loop1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        for(int i=1; i<11; i++){
            System.out.printf("%n"+a+" x "+i+" = "+(a*i));
        }
    }
}
