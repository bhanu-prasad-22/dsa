//“I’d start with recursion for clarity, then convert to iteration if optimization or memory becomes a concern.”
class FactDemo
{
    static int fact(int n)
    {
        if(n<=1)
             return 1;
        else
              return n * fact(n-1);
    }
    public  static void main(String[] args)
    {
        int a=fact(5);
        System.out.println(a);
        System.out.println("factorial of 5 iterative");
        int fact=1;
        for(int i=1;i<=5;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}