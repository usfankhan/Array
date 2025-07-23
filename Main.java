// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
     System.err.println("Enter the size of the array");
      int n=sc.nextInt();
      int arr[]=new int[5];
      System.out.println("Enter the Array");
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int sum=0;
      System.out.println("THE ARRAY ELEMENTS:");
      for(int i=0;i<n;i++){
          System.out.println(arr[i]);
          sum=sum+arr[i];
      }
      System.out.println("SUM"+sum);
      int max=0;
      for(int i=0;i<n;i++)
        if(arr[i]>max)
            max=arr[i];
 
       System.out.println(max); }
}
