class BubbleSort
{
    public static void bubbleSort(int[] arr)
    {
        for (int i= 0; i< arr.length; i++) {
            boolean swapped=false;
            for (int j= 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                
            }
            if(!swapped)//if no two elements were swapped in inner lop array is sorted we can stop early.
            {
                break;
            }
        }

    }
    public static void main(String[] args) {
           int[] a={1,2,3,5,4};
           System.err.println("Before bubble sort");
           for (int i = 0; i < a.length; i++) {
               System.out.println(a[i]);
           }
           bubbleSort(a); 
           System.err.println("After bubble sort");
             for (int i = 0; i < a.length; i++) {
               System.out.println(a[i]);
           }

    }
}