#include <stdio.h>
int digitcount(int n);
int digitcount(int n)
{
    int count;
    count=0;
    while(n!=0)
    {
        n=n/10;
        count++;
    }
    return count;
}
void main()
{
    int n;
    scanf("%d",&n);
    printf("%d",digitcount(n));
}
