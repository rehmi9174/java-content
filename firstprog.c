/* Topic - C loops
    Author - Rahman
	Date - 15/02/2021


*/ 

Program 1 :

#include<stdio.h>
#include<conio.h>
void main(){{
  int i,j;
  for(i=1;i<=2;i++)
  {
     for(j=1;j<=3;j++){
	 printf(" i=%d  j=%d ",i,j);
	 }
  }
  getch();
}

-------------------------------------
program 2 :
#include<stdio.h>
#include<conio.h>
void main(){{
  int i,j;
  for(i=1;i<=5;i++)
  {
     for(j=1;j<=i;j++){
	 printf(" %d ",j);
	 }
	 printf("\n");
	 
  }
  getch();
}


 Out put :- 
--------- 
  1
  1 2
  1 2 3
  1 2 3 4
  1 2 3 4 5
  
  ---------------------------------------------
  prog 4 :
  
  #include<stdio.h>
#include<conio.h>
void main(){{
  int i,j;
  for(i=1;i<=5;i++)
  {
     for(j=1;j<=i;j++){
	 printf("%d ",* );
	 }
	 print("\n");
  }
  getch();
}

  Out put : 
-----------  
  * 
  * * 
  * * *
  * * * *
  * * * * * 
  
  
  
--------------------------------------------------------------------------  
  prog 4 :  
  -------
  
  #include<stdio.h>
#include<conio.h>
void main(){{
  int i,j;
  for(i=5;i>=1;i--)
  {
     for(j=1;j<=i;j++){
	 printf("%d ",* );
	 }
	 print("\n");
  }
  getch();
}


Out put :
          * * * * * 
		  * * * *
		  * * * 
		  * * 
		  *

  #include<stdio.h>
#include<conio.h>
void main(){{
  int i,j;
  for(i=1;i<=5;i++)
  {
     for(j=5;j>=i;j--){
	 printf("%d ",* );
	 }
	 print("\n");
  }
  getch();
}


          * * * * * 
		  * * * *
		  * * * 
		  * * 
		  *
		  
		  
		  
		  
--------------------------------------------------------------------------

 prog 5 : 

  #include<stdio.h>
#include<conio.h>
void main(){{
  int i,j;
  for(i=1;i<=5;i++)
  {
     for(j=1;j<=2*i;j++){
	 printf(" * " );
	 }
	 print("\n");
  }
  getch();
}

 Out put : 
 ------
 
     * * 
	 * * * *
	 * * * * * * 
	 * * * * * * * *
------------------------------------------------------------------------
  Assignment : - 
  
  
                *
			   * *
			  * * *
			 * * * *
			* * * * *
	 
 

-------------------------------------------------------------------------

prog 6 :       


#include<stdio.h>
#include<conio.h>
void main(){{
  int i,j,k;
  for(i=1;i<=10;i++)
  {
     for(j=1;j<=10;j++){
	 for(k=1;k<10;k++){
		 If(k>=1)
             break;			 
	  }
	  if(j>=2)
		  break;
	 }
	 if(i>=3)
		 break;
  }
  getch();
}















































		  
  

  
