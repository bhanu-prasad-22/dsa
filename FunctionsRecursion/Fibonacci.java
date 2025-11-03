//“I’d start with recursion for clarity, then convert to iteration if optimization or memory becomes a concern.”
class Fibonacci
{
    static int fib(int n)
    {
        if(n<=1)
            return n;
        else
              return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            System.out.print(fib(i)+" ");
        }
        System.out.println("iterative");
        int n=5;
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}