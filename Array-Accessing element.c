#include <stdio.h>

int main()
{
    int size;
    printf("Enter size of the array\n");
    scanf("%d",&size);
    int arr[size];
    printf("Enter %d elements in the array\n",size);
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    int index;
    printf("Enter index to be accessed\n");
    scanf("%d",&index);
    if(index>=0 && index<=size-1)
    printf("%d\n",arr[index]);
    else
    printf("Index out of array size\n");

    return 0;
}
