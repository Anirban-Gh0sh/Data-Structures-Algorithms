public class selectionSort{
    public static void main(String args[]){
        int array[]={5,8,22,54,90,1,-3,-22};
        int length=array.length;
        System.out.println("Unsorted Array");
        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0;i<length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<length;j++){
                if(array[j]<array[minIndex])
                minIndex=j;
            }
            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;
        }
        System.out.println("Sorted Array");
        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
