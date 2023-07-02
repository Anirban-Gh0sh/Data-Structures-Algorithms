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
    int element;
    printf("Enter element to be searched\n");
    scanf("%d",&element);
    int c=0,index=0;
    for(int i=0;i<size;i++)
    {
        if(arr[i]==element)
        {
            c=1;
            index=i;
            break;
        }
        else
        {
            c=0;
        }
    }
    if(c==1)
    printf("%d found at %d index\n",element,index);
    else
    printf("Element not found in the array\n");

    return 0;
}
