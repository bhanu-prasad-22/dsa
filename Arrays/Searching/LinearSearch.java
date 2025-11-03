
import java.util.Scanner;

class LinearSearch
{

    public static  int linearSearch(int[] arr,int t)
    {
          for(int i=0;i<arr.length;i++)
          {
            if(arr[i]==t)
            {
                return i;
            }
          }
          return -1;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+ " numbers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int t;
        System.out.println("enter target:");
        t=sc.nextInt();
       int  index=linearSearch(arr,t);
       if(index==-1)
       {
        System.out.println("Element not found");
       }
       else{
        System.out.println("element found at :"+index);
       }
    }
}