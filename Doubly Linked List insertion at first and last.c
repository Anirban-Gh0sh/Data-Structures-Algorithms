#include<stdio.h>
#include<stdlib.h>
struct node
{
    char data;
    struct node*left;
    struct node*right;
};
void insertion_Atfirst(struct node*head,char data1)
{
    struct node*ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=data1;
    
    ptr->right=head;
    head->left=ptr;
    head=ptr;

    while(ptr!=NULL)
    {
        printf("%c  ",ptr->data);
        ptr=ptr->right;
    }
} 
void insertion_Atlast(struct node*head,char data1)
{
    struct node*ptr;
    ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=data1;
    ptr->right=NULL;
    
    struct node*p;
    p=(struct node*)malloc(sizeof(struct node));
    p=head;
    
    while(p->right!=NULL)
    {
        p=p->right;
    }
    p->right=ptr;
    ptr->left=p;
    
    struct node*first;
    first=(struct node*)malloc(sizeof(struct node));
    first=head;
     while(first!=NULL)
    {
        printf("%c  ",first->data);
        first=first->right;
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
    
    printf("doubly linked list created\n");
    printf("%d  %c  %d  %d  %c  %d  %d  %c  %d\n",head->left,head->data,head->right,second->left,second->data,second->right,third->left,third->data,third->right);
    
    printf("Insertion at first\n");
    insertion_Atfirst(head,'D');
    printf("\nInsertion at last\n");
    insertion_Atlast(head,'E');
}
