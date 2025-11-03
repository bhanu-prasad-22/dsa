class AgeException extends Exception
{
    AgeException(String msg)
    {
        super(msg);
    }
}
class Vote
{
    int age;
    void vote(int age) throws AgeException{
    if(age<18)
    {
        throw new AgeException("Not eligible to vote");
    }
    else
    {
        System.out.println("eligible to vote");
    }
    }
}
class CustomExceptions
{

    public static void main(String[] args)
    {
        Vote v=new Vote();
        try{
            v.vote(19);
        }
        catch(AgeException e)
        {
            System.out.println("error:"+e);
        }


    }
}