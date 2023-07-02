#include<stdio.h>
int main()
{
    int arr[100];
    int size=(sizeof(arr)/(sizeof(arr[0])));
    printf("%d",size);
    return 0;
}
