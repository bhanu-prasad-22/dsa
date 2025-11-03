class Box<T> {
    private T value;

    void set(T value)
    {
        this.value=value;
    }
    T get(){
        return value;
    }
}

public class Demo{
    public static void main(String[] args)
    {
        Box<Integer> intBox=new Box<>();
        intBox.set(100);
        System.out.println(intBox.get());

        Box<String> strBox=new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());
    }
}