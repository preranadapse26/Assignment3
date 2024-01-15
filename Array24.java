import java.util.*;
public class Array24 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Eneter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search element");
        int search=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(search==arr[i]){
                System.out.println(search+" found at"+i+" position");
            }else{
                System.out.println("element not found");
            }
        }


    }
}
