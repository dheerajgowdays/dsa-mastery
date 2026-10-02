import java.util.Arrays;
import java.util.Scanner;

public class AHelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String[] parts = s.split("\\+");
        
        Arrays.sort(parts);
        
        System.out.println(String.join("+", parts));
    }
}