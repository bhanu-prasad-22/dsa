
import java.util.Scanner;

class Largest{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);//System.in is to specify to read data from console keyboard
        System.out.println("Enter n:");
        n=sc.nextInt();//to read Integer nextLine()for reading entire line including spaces,nextDouble for double numbers simple next for Strings
        int[] arr=new int[n];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("largest in array:"+max);
    }
}