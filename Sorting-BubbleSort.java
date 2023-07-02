public class bubbleSort{
    public static void main(String args[]){
        int array[]={5,8,22,54,90,1,-3};
        int length=array.length;
        System.out.println("unSorted Array");
        for(int i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();  
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for(int i=0;i<length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
