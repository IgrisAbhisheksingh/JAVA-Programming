 #include<stdio.h>
 #include<stdlib.h>
  
  typedef struct list
  {
  int data;
  struct node *next}ll;
  
 ll *makenode ()
 {
 ll *p;
 p=(ll *)malloc(sizeof(ll *);
 p->next=0;
 printf("enter the data");
 scanf("%d",p->data);
 return p;
 }
 
 ll *addfirst(ll *h)
 {
 ll *p;
 p=makenode();
 p->next=h;
 return p;
 }
 
 ll * delfirst(ll *h)
 ll *t;
 {
 if(h==0)
 printf("the list is empty");
 
if(h->next==0)
{
printf("deleting %d data",h->data);
return 0;
}
h=t;
if (h->next!==0)

t->next=h;
printf("deleting %d data",t->data);
free(t);

}
 
 int main()
 {
 int ch;
 
 ll *head=0;
 
 printf("\n 1.for push");
 printf("\n 2.for pop");
 printf("\n 3.exit");
 
 while(1)
 {
 printf("enter your choice");
 scanf("%d"&ch);
 switch(ch)
 {
 case 1: head=addfirst(head); break;
 
 case 2: head=delfirst(head); break;
 default : printf("MISSION IMPOSSIBLE");
 exit (0);
 }
 }
 }

 
 