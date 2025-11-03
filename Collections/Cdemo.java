import java.util.*;
class Cdemo
{
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("Tesla");
        list.add("BMW");
        list.add("Audi");
       /* for(String arr:list)
        {
            System.out.println(arr);
        }*/
       Iterator<String> it=list.iterator();
       while(it.hasNext())
       {
        String i=it.next();
        System.out.println(i);
        if(i.equals("BMW"))
            it.remove();
       }
       System.out.println("After removal : "+ list);

   
       HashSet<Integer> set=new HashSet<>();
       set.add(10);
       set.add(20);
       set.add(10);//duplicates ignored
       System.out.println(set);


       HashMap<Integer,String> map=new HashMap<>();
       map.put(1,"Alice");
       map.put(2,"Bob");
       map.put(3,"Charlie");
       for(Map.Entry<Integer,String> e:map.entrySet())
       {
        System.out.println(e.getKey()+" -> "+ e.getValue());
       }
    }
}