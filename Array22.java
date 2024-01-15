import java.util.Scanner;

public class Array22 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter arry element");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Eneter array elements");
        int Evencount=0;
        int Ocount=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                Evencount++;
            }else{
                Ocount++;
            }
        }
                
            System.out.println("Number of Even Elemnets "+Evencount);
            System.out.println("Number of Odd Elements "+Ocount);

        
    }
}
