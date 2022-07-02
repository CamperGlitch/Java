import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class prime {
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
        System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
    
    }
}
