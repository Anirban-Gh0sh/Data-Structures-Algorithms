#include<stdio.h>
void traversalBeforeInsertion(int arr[],int size)
{
    for(int i=0;i<size-1;i++)
    {
        printf("%d ",arr[i]);
    }
}
void traversalAfterInsertion(int arr[],int size,int index,int element)
{
    for(int i=size;i>index;i--)
    {
        arr[i]=arr[i-1];
    }
    arr[index]=element;
    for(int i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }
}
int main()
{
    int arr[11]={1,2,3,4,5,6,7,8,9,10};
    int size=(sizeof(arr)/sizeof(arr[0]));
    int index=7,element=-1;
    
    traversalBeforeInsertion(arr,size);
    printf("\n");
    traversalAfterInsertion(arr,size,index,element);
    return 0;
}
