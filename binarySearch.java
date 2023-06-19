//Binary search works only for sorted arrays
public class binarySearch{
    public static void main(String[]args){
        int array[]={1,2,4,9,16,54,89,126,547,1024};
        int length=array.length;
        int lb=0,ub=length-1,mid;
        int key=16;
        int index=0,c=0;
        while(lb<=ub)
        {
            mid=(ub+lb)/2;
            if(key==array[mid]){
                c=1;
                index=mid;
                break;
            }
            else if(key<array[mid]){
                ub=mid-1'
            }
            elseif(key>array[mid])
        }
    }
}