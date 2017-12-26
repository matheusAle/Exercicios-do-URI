import java.util.Scanner;

public class ex1221 {
    
    static boolean isPrime(Long number){
        if (number == 1) return false;
        if (number == 2) return true;
        if (number %2 == 0) return false;
                
        long max = (long)Math.sqrt(number) + 1;
        for (long i = 3; i < max; i += 2)
            if (number %i == 0) return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0, n = scanner.nextInt(); i < n; i++){
            System.out.println((isPrime(scanner.nextLong()) ? "Prime" : "Not Prime"));
        }
    }
 
}
