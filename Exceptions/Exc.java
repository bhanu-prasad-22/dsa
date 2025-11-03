import java.io.*;
class Exc
{
    public static void main(String[] args)
    {
        int[] a={1,2,3};
        try
        {
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("error:"+e);
        }
        finally
        {
            System.out.println("finally");
        }
    }
}