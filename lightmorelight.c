#include<stdio.h>
int main()
{
int i,n;
int r=5;
int array[10000];
printf("Enter Number");
scanf("%d",&n);
for(i=1;i<=n;i++)
 {
  array[i]=0;
 }
 while(r<=n)
{
  for(i=r;i<=n;i++)
  {
   if(i%r==0)
    {
     if(array[i]==0)
     {
       array[i]=1;
     }
     else
      {
        array[i]=0;
      }
    }
   } 
   r++;  
  }
  
  if(array[i]==0)
  { 
   printf("No");
  }
  else
  {
   printf("Yes");
  }
 return 0;
}