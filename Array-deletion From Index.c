#include<stdio.h>
void traversalBeforeDeletion(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }
}
void traversalAfterDeletion(int arr[],int size,int index)
{
    for(int i=index;i<size-1;i++)
    {
        arr[i]=arr[i+1];
    }
    
    for(int i=0;i<size-1;i++)
    {
        printf("%d ",arr[i]);
    }
}
int main()
{
    int arr[10]={1,2,3,4,5,6,7,8,9,10};
    int size=(sizeof(arr)/sizeof(arr[0]));
    int index=2;
    
    traversalBeforeDeletion(arr,size);
    printf("\n");
    traversalAfterDeletion(arr,size,index);
    return 0;
}
