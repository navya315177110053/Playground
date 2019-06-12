#include<stdio.h>
int main()
{
  int a=365,c,d;
  c=a/4;
  d=a%4;
  scanf("%d %d",&c,&d);
  printf("Quotient: %d\n",c);
  printf("Remainder: %d",d);
  //Type your code here
  return 0;
}