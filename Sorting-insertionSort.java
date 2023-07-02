public class insertionSort
{
    public static void main(String args[])
    {
        int array[]={5,4,3,2,1};
        int n=array.length;
        for(int i=1;i<n;i++)
        {
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key)
            {
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
