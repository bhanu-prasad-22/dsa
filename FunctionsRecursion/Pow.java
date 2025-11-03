//“I’d start with recursion for clarity, then convert to iteration if optimization or memory becomes a concern.”
class Pow
{
    static int pow(int a,int b)
    {
        if (b==0)
        return 1;
        else
           return a * pow(a,b-1);

    }
    public static void main(String[] args)
    {
        System.out.println(pow(2,3));
    }
}