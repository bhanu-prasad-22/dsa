class SelectionSort
{
    public static void selectionSort(int[] a)
    {
              for(int i=0;i<a.length-1;i++)//we just need to do for n-1 elements last will be sorted after n-1 elements
              {
                int minIndex=i;
                for(int j=i+1;j<a.length;j++)//remianing indexes
                {
                    if(a[j]<a[minIndex])//finding minElement in remainning index
                    {
                        minIndex=j;
                    }

                }

                int temp=a[minIndex];
                a[minIndex]=a[i];
                a[i]=temp;
              }
    }
    public static void main(String[] args) {
         int[] a={5,4,2,1,3};
           System.err.println("Before selection sort");
           for (int i = 0; i < a.length; i++) {
               System.out.println(a[i]);
           }
           selectionSort(a); 
           System.err.println("After slection sort");
             for (int i = 0; i < a.length; i++) {
               System.out.println(a[i]);
           }
        
    }
}