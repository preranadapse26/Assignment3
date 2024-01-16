import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array28 {
    public static void main(String[] args) throws IOException{
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size");
        int size1=Integer.parseInt(br.readLine());
        int arr1[]=new int[size1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter array size");
        int size2=Integer.parseInt(br.readLine());
        int arr2[]=new int[size2];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=Integer.parseInt(br.readLine());
        }
        int flag=0;
        System.out.println("Uncommon elements between array");
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
           if(arr1[i]==arr2[j]){
            flag=1;

           }
    
        }
        if(flag==0){
            System.out.println(arr1[i]);
        }
        flag=0;
        
    }
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr2[i]==arr1[j]){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println(arr2[i]);
        }
        flag=0;

    }


    }
}

