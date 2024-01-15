import java.io.*;
public class Array27 {
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
            arr1[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Common elements between array");
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
           if(arr1[i]==arr2[j]){
            System.out.println(arr1[i]);
            

           }
    
        }
        System.out.println();
    }


    }
}
