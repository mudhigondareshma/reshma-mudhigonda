#include <stdio.h>
void add(int,int);
void add(int a,int b)
{
    printf("sum=%d",a+b);
}
void main()
{
    int x,y;
    scanf("%d%d",&x,&y);
    add(x,y);
}
