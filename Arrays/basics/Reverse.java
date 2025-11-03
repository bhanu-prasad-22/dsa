
import java.util.Scanner;

class Reverse
{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" Numbers:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("The intial array is:");
        for (int i = 0; i < n; i++) {
               System.out.println(a[i]);   
        }
        int left=0;
        int right=a.length -1;
        while(left < right)
        {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    System.out.println("Reversed array");
    for(int i:a)
    {
        System.out.println(i);
    }
}
}