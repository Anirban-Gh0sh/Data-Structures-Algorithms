#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
};
struct node*creation(int data)
{
    struct node*p;
    p=(struct node*)malloc(sizeof(struct node));
    p->data=data;
    return p;
}
void deleteAtFirst(struct node*head)
{
    struct node*ptr;
    ptr=(struct node*)malloc(sizeof(struct node));
    ptr=head;
    head=head->next;
    ptr->next=NULL;
    free(ptr);
    // printf("%d",ptr->data);
    while(head!=NULL)
    {
        printf("%d ",head->data);
        head=head->next;
    }
}
int main()
{
    struct node*head=creation(2);
    struct node*first=creation(4);
    struct node*second=creation(6);
    struct node*third=creation(8);
    
    head->next=first;
    first->next=second;
    second->next=third;
    third->next=NULL;
    // printf("%d",head->next->next->next->data);
    deleteAtFirst(head);
}
