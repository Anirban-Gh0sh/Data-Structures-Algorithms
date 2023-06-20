#include<stdio.h>
#include<stdlib.h>
struct node
{
    char data;
    struct node*left;
    struct node*right;
};
int main()
{
    struct node*head;
    struct node*second;
    struct node*third;
    
    head=(struct node*)malloc(sizeof(struct node));
    second=(struct node*)malloc(sizeof(struct node));
    third=(struct node*)malloc(sizeof(struct node));
    
    head->data='A';
    second->data='B';
    third->data='C';
    
    head->left = NULL;
    head->right = second;
    second->left = head;
    second->right = third;
    third->left = second;
    third->right = NULL;
    
    
    printf("%d  %c  %d  %d  %c  %d  %d  %c  %d",head->left,head->data,head->right,second->left,second->data,second->right,third->left,third->data,third->right);
    
    
}
