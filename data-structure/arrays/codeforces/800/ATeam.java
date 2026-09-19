import java.util.Scanner;

public class ATeam{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        int solvedCount = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b + c >= 2) {
                solvedCount++;
            }
        }

        System.out.println(solvedCount);
        sc.close();
    }S
}