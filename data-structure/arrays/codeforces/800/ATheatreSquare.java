import java.util.Scanner;
public class ATheatreSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) return;

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long stonesAlongLength = (n + a - 1) / a;
        long stonesAlongWidth = (m + a - 1) / a;

        long totalStones = stonesAlongLength * stonesAlongWidth;

        System.out.println(totalStones);
        sc.close();
    }
}