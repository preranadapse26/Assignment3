import java.util.Scanner;

public class Array25 {
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Eneter array  elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
         if(min>arr[i]){
            min=arr[i];
         }

        }
        System.out.println("Minimum element in the array="+min);
   } 
}
