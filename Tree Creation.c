// Creation of tree using c
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*left;
    struct node*right;
};

// Method to create nodes with corresponding values
struct node * creationOfTree(int value)
{
    struct node*n;
    n=(struct node*)malloc(sizeof(struct node));
    n->data=value;
    n->left=NULL;
    n->right=NULL;
    return n;
}
int main()
{
    // Creating struct node type pointers for nodes
    struct node*n1=creationOfTree(5);
    struct node*n2=creationOfTree(2);
    struct node*n3=creationOfTree(6);
    
    // Linking of nodes to form the tree
    n1->left=n2;
    n1->right=n3;
    
    // to check whether tree is created or not
    printf("%d\n",n1->data);
    printf("%d\n",n1->left->data);
    printf("%d\n",n1->right->data);
    return 0;
}
