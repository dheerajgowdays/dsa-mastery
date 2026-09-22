import java.util.Scanner;

public class ABit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return ;

        int n = sc.nextInt();
        int count = 0;
        while(n-- > 0){
            String a = sc.next().toUpperCase();
            if(a.equals("++X") || a.equals("X++"))
                count++;
            else if(a.equals("--X") || a.equals("X--")){
                count--;
            }else{
                return;
            }
        }
        System.out.println(count);
        sc.close();
    }
}