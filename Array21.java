import java.util.*;
public class Array21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arry element");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            sum=sum+arr[i];
        }  
        System.out.println(sum);
    }
}
