class InsertionSort
{
    public static void insertionSort(int[] a)
    {
              for(int i=1;i<a.length;i++)//we start with second element as key
              {
                int key=i;
               int  j=i-1;
               while(j>=0 && a[j]>a[key])
               { 
                a[j+1]=a[j];
                j--;

               }
                a[j+1]=key;

                
              }
    }
    public static void main(String[] args) {
         int[] a={5,4,2,1,3};
           System.err.println("Before Insertion sort");
           for (int i = 0; i < a.length; i++) {
               System.out.println(a[i]);
           }
           insertionSort(a); 
           System.err.println("After Insertion sort");
             for (int i = 0; i < a.length; i++) {
               System.out.println(a[i]);
           }
        
    }
}