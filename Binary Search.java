public class BinarytSearch{
    public static void main(String args[])
    {
        int array[]={0,2,6,12,23,56,78,91,102,298};
        int lb,ub,mid,key,index,c;
        lb=0;
        ub=array.length-1;
        key=91;
        index=0;
        c=0;
        
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(array[mid]==key)
            {
                index=mid;
                c=1;
                break;
            }
            else if(array[mid]<key)
            lb=mid+1;
            else if(array[mid]>key)
            ub=mid-1;
        }
        if(c==1)
        System.out.println("Element "+key+" found at index "+index);
        else
        System.out.println("Element not Found");
    }
}
