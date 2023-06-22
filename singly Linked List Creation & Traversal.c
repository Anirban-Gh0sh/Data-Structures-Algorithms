#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
};
struct node* Creation(int data)
{
    struct node*ptr;
    ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=data;
    return ptr;
}
void traversal(struct node*head)
{
    while(head!=NULL)
    {
        printf("%d ",head->data);
        head=head->next;
    }
}
int main()
{
    struct node*head;
    struct node*second;
    struct node*third;
    struct node*fourth;
    head=Creation(2);
    second=Creation(4);
    third=Creation(6);
    fourth=Creation(8);
    
    head->next=second;
    second->next=third;
    third->next=fourth;
    fourth->next=NULL;
    
    traversal(head);
}
