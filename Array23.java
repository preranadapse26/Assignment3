import java.util.Scanner;

public class Array23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Eneter array elements");
        int EvenSum=0;
        int Osum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                EvenSum=EvenSum+arr[i];
            }else{
                Osum=Osum+arr[i];
            }
        }
                
            System.out.println("Sum of Even Elemnets "+EvenSum);
            System.out.println("Sum of Odd Elements "+Osum);
        
    
    }
}
