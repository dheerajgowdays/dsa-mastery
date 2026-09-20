import java.util.Scanner;
public class AHelpfulMaths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split("\\+");
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i] = Integer.parseInt(arr[i]);        }
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(i==arr1.length-1){
                System.out.print(arr1[i]);  
            }else{
                System.out.print(arr1[i]+"+");
            }
        }
    }
}