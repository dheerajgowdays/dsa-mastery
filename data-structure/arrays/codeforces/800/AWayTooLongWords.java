import java.util.Scanner;

class AWayTooLongWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] a = new String[n];
        for(int i=0;i<n;i++){
            a[i] = sc.next();
        }
        for(String s: a){
            if(s.length()>10){
                System.out.println(s.charAt(0) + "" + (s.length()-2) + "" + s.charAt(s.length()-1));
            }else {
                System.out.println(s);
            }
        }
    }
}