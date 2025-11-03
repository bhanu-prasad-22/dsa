
import java.util.Scanner;

class Minimum {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Numbers:" );
        for(int i=0;i<n;i++)
        {
                 arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for (int i = 1; i < n; i++) {
           if(arr[i]<min)
           {
            min=arr[i];
           }   
        }
        System.out.println("The minimum element is:"+min);
    }
}