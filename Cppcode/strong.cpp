 #include<iostream>
 // Example of storang no.
 using namespace std;
 int main() 

 {	int i, n, j, r, sum = 0, f = 1;
	cin >> n;	
	
 for( j= n; j > 0; j =  j/ 10 )

 	{	

	f= 1;  	
	r = j% 10;	
	
 for (i = 1; i <= r; i++)
{ f = f * i;					}			
 sum = sum+ f;	}	
				
 if(n == sum)	{	
cout << n << " is a Strong Number";	}
 else	{
cout << n<< " is Not a Strong Number";	} 
  return 0; }
