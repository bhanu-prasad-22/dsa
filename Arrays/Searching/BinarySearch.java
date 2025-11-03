
import java.util.Scanner;

class BinarySearch
{

    public static  int binarySearch(int[] arr,int t)
    {
          int low=0;
          int high=arr.length-1;
          while(low<= high)
          {
            int mid=(low+high)/2;
            if(arr[mid]==t)
            {
                return mid;
            }
            else if(arr[mid]<t)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
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
       int  index=binarySearch(arr,t);
       if(index==-1)
       {
        System.out.println("Element not found");
       }
       else{
        System.out.println("element found at :"+index);
       }
    }
}