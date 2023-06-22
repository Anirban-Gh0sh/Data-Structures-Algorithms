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
void traversal(struct node*new_head)
{
    while(new_head!=NULL)
    {
        printf("%d ",new_head->data);
        new_head=new_head->next;
    }
}
struct node* insertion_first(struct node*head,int data)
{
    struct node*ptr;
    ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=data;
    ptr->next=head;
    head=ptr;
    return head;
}
struct node* insertion_last(struct node*head,int data)
{
    struct node*ptr;
    ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=data;
    ptr->next=NULL;
    
    struct node*p;
    p=(struct node*)malloc(sizeof(struct node));
    p=head;
    while(p->next!=NULL)
    {
        p=p->next;
    }
    p->next=ptr;
    return head;
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
    struct node* head1=insertion_first(head,0);
    printf("\n");
    traversal(head1);
    struct node*head2=insertion_last(head1,10);
    printf("\n");
    traversal(head2);
    struct node*head3=insertion_last(head1,12);
    printf("\n");
    traversal(head3);
}
