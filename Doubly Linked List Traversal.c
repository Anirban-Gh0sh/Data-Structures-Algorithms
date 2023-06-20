#include<stdio.h>
#include<stdlib.h>
struct node
{
    char data;
    struct node*left;
    struct node*right;
};

void traversal(struct node*ptr)
{
    while(ptr!=NULL)
    {
        printf("%c  ",ptr->data);
        ptr=ptr->right;
    }
}
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
    
    traversal(head);
    
}
